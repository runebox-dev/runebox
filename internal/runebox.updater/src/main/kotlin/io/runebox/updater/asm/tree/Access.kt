package io.runebox.updater.asm.tree

import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import java.lang.reflect.Modifier

val ClassNode.isAbstract get() = Modifier.isAbstract(access)
val ClassNode.isInterface get() = Modifier.isInterface(access)
val ClassNode.isPublic get() = Modifier.isPublic(access)

val MethodNode.isPrivate get() = Modifier.isPrivate(access)
val MethodNode.isFinal get() = Modifier.isFinal(access)
val MethodNode.isAbstract get() = Modifier.isAbstract(access)
val MethodNode.isStatic get() = Modifier.isStatic(access)
val MethodNode.isProtected get() = Modifier.isProtected(access)

val FieldNode.isPrivate get() = Modifier.isPrivate(access)
val FieldNode.isFinal get() = Modifier.isFinal(access)
val FieldNode.isStatic get() = Modifier.isStatic(access)
val FieldNode.isProtected get() = Modifier.isProtected(access)