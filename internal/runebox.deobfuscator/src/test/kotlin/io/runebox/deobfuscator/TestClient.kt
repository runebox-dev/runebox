@file:Suppress("DEPRECATION", "removal")

package io.runebox.deobfuscator

import java.applet.Applet
import java.applet.AppletContext
import java.applet.AppletStub
import java.awt.Color
import java.awt.Dimension
import java.awt.GridLayout
import java.io.File
import java.net.URL
import java.net.URLClassLoader
import javax.swing.JFrame

class TestClient(private val clientJar: File, private val vanillaClientJar: File? = null) {

    private val params = hashMapOf<String, String>()

    fun start() {
        // Fetch Params
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

        // Create Applet from client.class
        val classLoader = if(vanillaClientJar != null) URLClassLoader(arrayOf(clientJar.toURI().toURL(), vanillaClientJar.toURI().toURL())) else URLClassLoader(arrayOf(clientJar.toURI().toURL()))
        val mainClass = params["initial_class"]!!.replace(".class", "")
        val applet = try {
            classLoader.loadClass(mainClass).newInstance() as Applet
        } catch (e: ClassNotFoundException) {
            classLoader.loadClass(mainClass.replaceFirstChar { it.uppercaseChar() }).newInstance() as Applet
        }

        applet.background = Color.BLACK
        applet.layout = null
        applet.size = Dimension(params["applet_minwidth"]!!.toInt(), params["applet_minheight"]!!.toInt())
        applet.preferredSize = applet.size
        applet.createStub()
        applet.isVisible = true
        applet.init()

        // Create JFrame window to display applet
        val frame = JFrame("Test Client - ${clientJar.name}")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.layout = GridLayout(1, 0)
        frame.add(applet)
        frame.pack()
        frame.minimumSize = frame.size
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
    }

    private fun Applet.createStub() {
        val stub = object : AppletStub {
            override fun isActive(): Boolean = true
            override fun getAppletContext(): AppletContext? = null
            override fun getParameter(name: String): String? = params[name]
            override fun getDocumentBase(): URL = URL(params["codebase"])
            override fun getCodeBase(): URL = URL(params["codebase"])
            override fun appletResize(width: Int, height: Int) { setSize(width, height) }
        }
        this.setStub(stub)
    }
}