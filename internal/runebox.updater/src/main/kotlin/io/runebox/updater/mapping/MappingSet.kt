package io.runebox.updater.mapping

import com.google.common.collect.HashBiMap
import io.runebox.updater.Logger

class MappingSet {

    private val classes = HashBiMap.create<String, String>()

    fun mapClass(name: String) = classes[name]
    fun mapClassSafe(name: String) = classes[name] ?: name

    fun inverseClass(name: String) = classes.inverse()[name]

    fun addClassMapping(oldName: String, newName: String) {
        val existing = classes[oldName]
        if(existing != null && existing != newName) {
            Logger.warning("Existing class mapping for $oldName from $existing to $newName.")
            return
        }
        classes[oldName] = newName
    }

    val mappedClasses get() = classes.keys


}