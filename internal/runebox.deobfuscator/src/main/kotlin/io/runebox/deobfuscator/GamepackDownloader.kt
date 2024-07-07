package io.runebox.deobfuscator

import java.io.File
import java.net.URL

object GamepackDownloader {

    private val GAMEPACK_DOWNLOAD_URL = "https://github.com/runetech/osrs-gamepacks/raw/master/gamepacks/"

    @JvmStatic
    fun main(args: Array<String>) {
        if(args.isEmpty()) error("Usage: gamepackDownloader.jar <output> [-r, --revision]")
        val outputJar = File(args[0])
        val params = fetchParams()
        var revision = params["25"]!!
        if(args.size >= 3) {
            if(args[1] == "-r" || args[1] == "--revision") {
                revision = args[2]
                if(revision.isBlank() || revision == "latest") {
                    revision = params["25"]!!
                } else if(revision == "prev" || revision == "last") {
                    revision = "${params["25"]!!.toInt() - 1}"
                }
            }
        }

        Logger.info("Downloading Old School RuneScape client revision: $revision...")
        val url = URL(GAMEPACK_DOWNLOAD_URL+"osrs-$revision.jar")

        if(outputJar.exists()) outputJar.delete()
        if(outputJar.parentFile?.exists() != true) outputJar.parentFile?.mkdirs()
        outputJar.createNewFile()

        outputJar.outputStream().use { output ->
            url.openConnection().getInputStream().use { input ->
                input.copyTo(output)
            }
        }
        Logger.info("Successfully downloaded client jar to file: ${outputJar.name}.")
    }

    private fun fetchParams(): Map<String, String> {
        val params = hashMapOf<String, String>()
        val lines = URL("http://oldschool1.runescape.com/jav_config.ws").readText().split("\n")
        lines.forEach {
            var line = it
            if(line.startsWith("param=")) {
                line = line.substring(6)
            }
            val idx = line.indexOf("=")
            if(idx >= 0) {
                params[line.substring(0, idx)] = line.substring(idx + 1)
            }
        }
        return params
    }
}