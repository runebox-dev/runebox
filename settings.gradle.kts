rootProject.name = "runebox"

module(":gamepack", title = "runescape")

module(":asm", "internal/")
module(":deobfuscator", "internal/")
module(":decompiler", "internal/")
module(":updater", "internal/")
module(":mixins")
module(":mixins.annotations", directory = "runebox.mixins/", title = "")
includeBuild("runebox.injector")

fun module(module: String, directory: String = "", title: String = "runebox") {
    var name = module
    if(module.lastIndexOf('.') > 0) {
        name = ":"+name.substring(1).replace(".", "-")
    }
    include(name)
    @Suppress("RemoveSingleExpressionStringTemplate")
    project(name).projectDir = file(directory+"${if(title.isNotBlank())"$title." else ""}"+module.substringAfter(":")+"/")
}