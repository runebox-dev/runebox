package io.runebox.updater.merge.mapping

import com.google.common.collect.HashBiMap
import io.runebox.updater.Logger

class MappingsSet {

    private val packages = HashBiMap.create<String, String>()
    private val classes = HashBiMap.create<String, String>()
    private val fields = HashBiMap.create<String, String>()
    private val methods = HashBiMap.create<String, MethodMapping>()
    private val methodsInverse = HashBiMap.create<String, MethodMapping>()

    private var modified = false

    fun mapClass(obfName: String) = classes[obfName]
    fun mapClassSafe(obfName: String) = classes[obfName] ?: obfName
    fun inverseClass(mappedName: String) = classes.inverse()[mappedName]

    fun addClassMapping(obfName: String, mappedName: String) {
        val exist = classes[obfName]
        if(exist != null && exist != mappedName) {
            Logger.error("Existing class mapping for $obfName from $exist to $mappedName.")
            return
        }
        classes[obfName] = mappedName
        modified = true
    }

    val mappedClasses get() = classes.keys

    class MethodMapping(
        private val set: MappingsSet,
        val obfOwner: String,
        val obfName: String,
        val obfDesc: String,
        val mapName: String? = null,
        val mapDesc: String? = null
    ) {
        constructor(
            set: MappingsSet,
            obfOwner: String,
            obfName: String,
            obfDesc: String
        ) : this(set, obfOwner, obfName, obfDesc, null, null)
    }
}