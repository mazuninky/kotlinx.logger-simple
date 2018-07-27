plugins {
    id("org.jetbrains.kotlin.platform.native") version "0.8"
}

/*konan.targets = mutableListOf("linux", "wasm32")

konanArtifacts {
    program("logger") {

    }
}
*/

dependencies {
    expectedBy(project(":kotlinx-logger-simple-common"))
}