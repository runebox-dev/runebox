rootProject.name = "runebox"

module(":gamepack", title = "runescape")

module(":asm", "internal/")
module(":deobfuscator", "internal/")
module(":decompiler", "internal/")
module(":updater", "internal/")

fun module(name: String, directory: String = "", title: String = "runebox") {
    include(name)
    project(name).projectDir = file(directory+"$title."+name.substringAfter(":")+"/")
}