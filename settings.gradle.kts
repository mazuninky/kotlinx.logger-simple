rootProject.name = "kotlinx.logger-simple"

fun module(path: String) {
  val i = path.lastIndexOf('/')
    val name = path.substring(i + 1)
    include(name)
    project(":$name").projectDir = File(path)
}

module("common/kotlinx-logger-simple-common")
module("jvm/kotlinx-logger-simple-jvm")
module("android/kotlinx-logger-simple-android")
module("js/kotlinx-logger-simple-js")
module("native/kotlinx-logger-simple-native")
