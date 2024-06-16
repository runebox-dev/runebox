package io.runebox.deobfuscator

import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.isIgnored
import io.runebox.deobfuscator.transformer.*
import java.io.File
import kotlin.reflect.full.createInstance

class Deobfuscator(
    private val inputJar: File,
    private val outputJar: File
) {

    var saveIgnoredClasses = true
    var saveInputJarResources = false

    private lateinit var pool: ClassPool
    private val transformers = mutableListOf<Transformer>()

    private fun registerTransformers() {
        transformers.clear()
        /**
         * ===== REGISTER TRANSFORMERS - START =====
         */

        register<VisibilityFixer>()
        register<RuntimeExceptionRemover>()
        register<DeadCodeRemover>()
        register<IllegalStateExceptionRemover>()
        register<ControlFlowNormalizer>()
        register<RedundantGotoRemover>()
        register<UniqueRenamer>()
        register<UnusedArgumentRemover>()
        register<StaticFieldOwnerFixer>()
        register<StaticMethodOwnerFixer>()
        register<UnusedFieldRemover>()
        register<UnusedMethodRemover>()
        register<ExprOrderNormalizer>()
        register<StackFrameBuilder>()
        register<MultiplierRemover>()

        /**
         * ===== REGISTER TRANSFORMERS - END =====
         */
        Logger.info("Registered ${transformers.size} transformers.")
    }

    private fun loadClasses() {
        Logger.info("Loading classes from input jar: ${inputJar.name}.")
        pool = ClassPool()
        pool.loadJar(inputJar)
        for(cls in pool.classes) {
            if(cls.name.startsWith("org/")) {
                cls.isIgnored = true
            }
        }
        Logger.info("Loaded ${pool.classes.size} classes from jar. (Ignored ${pool.ignoredClasses.size} classes)")
    }

    private fun saveClasses() {
        Logger.info("Saving deobfuscated classes to output jar: ${outputJar.name}.")
        pool.saveJar(outputJar, includeIgnored = saveIgnoredClasses, includeResources = saveInputJarResources)
        Logger.info("Successfully saved classes to jar.")
    }

    fun run() {
        Logger.info("Deobfuscating gamepack: ${inputJar.name}...")

        loadClasses()
        registerTransformers()
        executeTransformers()
        saveClasses()

        Logger.info("Deobfuscator completed successfully.")
    }

    private fun executeTransformers() {
        Logger.info("Starting execution of deobfuscation transformers.")

        val startTime = System.currentTimeMillis()
        for(transformer in transformers) {
            Logger.info("Running Transformer: '${transformer::class.simpleName}'.")
            transformer.transform(pool)
            transformer.postTransform(pool)
        }
        val elapsedTime = System.currentTimeMillis() - startTime
        Logger.info("Successfully executed all transformers. (Took ${(elapsedTime/1000L)}s)")
    }

    @DslMarker
    private annotation class TransformerDsl

    @TransformerDsl
    private inline fun <reified T : Transformer> register() {
        transformers.add(T::class.createInstance())
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size < 2) error("Usage: deobfuscator <inputJar> <outputJar>")

            val inputJar = File(args[0])
            val outputJar = File(args[1])

            val deobfuscator = Deobfuscator(inputJar, outputJar)
            deobfuscator.run()
        }
    }
}

fun String.isObfuscatedName(): Boolean {
    return (this.length <= 2 || (this.length == 3 && this !in listOf("add", "get", "set", "put", "run", "abs"))) || (listOf("class", "method", "field").any { this.startsWith(it) })
}