package io.runebox.asm.remap

import org.objectweb.asm.Handle
import org.objectweb.asm.tree.*

fun ClassNode.remap(remapper: AsmRemapper) {
    val origName = name
    name = remapper.mapType(origName)
    signature = remapper.mapSignature(signature, false)
    superName = remapper.mapType(superName)
    interfaces = interfaces?.map(remapper::mapType)

    val origOuterCls = outerClass
    outerClass = remapper.mapType(origOuterCls)

    if(outerMethod != null) {
        outerMethod = remapper.mapMethodName(origOuterCls, outerMethod, outerMethodDesc)
        outerMethodDesc = remapper.mapMethodDesc(outerMethodDesc)
    }

    for(innerCls in innerClasses) {
        innerCls.name = remapper.mapType(innerCls.name)
        innerCls.outerName = remapper.mapType(innerCls.outerName)
        innerCls.innerName = remapper.mapType(innerCls.innerName)
    }

    for(field in fields) {
        field.remap(remapper, origName)
    }

    for(method in methods) {
        method.remap(remapper, origName)
    }
}

fun FieldNode.remap(remapper: AsmRemapper, owner: String) {
    name = remapper.mapFieldName(owner, name, desc)
    desc = remapper.mapDesc(desc)
    signature = remapper.mapSignature(signature, true)
    value = remapper.mapValue(value)
}

fun MethodNode.remap(remapper: AsmRemapper, owner: String) {
    name = remapper.mapMethodName(owner, name, desc)
    desc = remapper.mapMethodDesc(desc)
    signature = remapper.mapSignature(signature, false)
    exceptions = exceptions.map(remapper::mapType)

    if(instructions.size() > 0) {
        for(insn in instructions) {
            insn.remap(remapper)
        }
        for(tcb in tryCatchBlocks) {
            tcb.remap(remapper)
        }
    }
}

fun AbstractInsnNode.remap(remapper: AsmRemapper) {
    when(this) {
        is FieldInsnNode -> {
            val origOwner = owner
            owner = remapper.mapType(origOwner)
            name = remapper.mapFieldName(origOwner, name, desc)
            desc = remapper.mapDesc(desc)
        }
        is MethodInsnNode -> {
            val origOwner = owner
            owner = remapper.mapType(origOwner)
            name = remapper.mapMethodName(origOwner, name, desc)
            desc = remapper.mapMethodDesc(desc)
        }
        is InvokeDynamicInsnNode -> {
            val origBsmArgs = bsmArgs
            name = remapper.mapInvokeDynamicMethodName(name, desc)
            desc = remapper.mapMethodDesc(desc)
            bsm = remapper.mapValue(bsm) as Handle
            for(i in bsmArgs.indices) {
                bsmArgs[i] = remapper.mapValue(origBsmArgs[i])
            }
        }
        is TypeInsnNode -> desc = remapper.mapType(desc)
        is LdcInsnNode -> cst = remapper.mapValue(cst)
        is MultiANewArrayInsnNode -> desc = remapper.mapType(desc)

    }
}

fun TryCatchBlockNode.remap(remapper: AsmRemapper) {
    type = remapper.mapType(type)
}

private fun remapFrameTypes(remapper: AsmRemapper, numTypes: Int, frameTypes: Array<Any>?): Array<Any>? {
    if(frameTypes == null) return frameTypes
    var remappedFrameTypes: Array<Any>? = null
    for(i in 0 until numTypes) {
        if(frameTypes[i] is String) {
            if(remappedFrameTypes == null) {
                remappedFrameTypes = Array(numTypes) { frameTypes[it] }
            }
            remappedFrameTypes[i] = remapper.mapType(frameTypes[i] as String)
        }
    }
    return remappedFrameTypes ?: frameTypes
}