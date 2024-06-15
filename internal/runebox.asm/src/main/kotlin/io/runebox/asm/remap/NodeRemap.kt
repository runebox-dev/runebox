package io.runebox.asm.remap

import org.objectweb.asm.tree.*

fun ClassNode.remap(remapper: AsmRemapper) {
    val origName = name
    name = remapper.mapType(origName)
    signature = remapper.mapSignature(signature, false)
    superName = remapper.mapType(superName)
    interfaces = interfaces?.map(remapper::mapType)

    val origOuterClass = outerClass
    outerClass = remapper.mapType(origOuterClass)

    if(outerMethod != null) {
        outerMethod = remapper.mapMethodName(origOuterClass, outerMethod, outerMethodDesc)
        outerMethodDesc = remapper.mapMethodDesc(outerMethodDesc)
    }

    for(innerClass in innerClasses) {
        innerClass.remap(remapper)
    }

    for(field in fields) field.remap(remapper, origName)
    for(method in methods) method.remap(remapper, origName)
}

fun InnerClassNode.remap(remapper: AsmRemapper) {
    name = remapper.mapType(name)
    outerName = remapper.mapType(outerName)
    innerName = remapper.mapType(innerName)
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

    for(insn in instructions) {
        insn.remap(remapper)
    }

    for(tcb in tryCatchBlocks) {
        tcb.remap(remapper)
    }
}

fun TryCatchBlockNode.remap(remapper: AsmRemapper) {
    type = remapper.mapType(type)
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
        is TypeInsnNode -> desc = remapper.mapType(desc)
        is MultiANewArrayInsnNode -> desc = remapper.mapType(desc)
        is LdcInsnNode -> cst = remapper.mapValue(cst)
    }
}