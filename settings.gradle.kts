rootProject.name = "runebox"

module(":asm", "internal/")

fun module(name: String, directory: String = "") {
    include(name)
    project(name).projectDir = file(directory+"runebox."+name.substringAfter(":")+"/")
}