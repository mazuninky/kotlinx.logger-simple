plugins {
    id("kotlin-platform-js")
}

dependencies {
    implementation(Config.JS.kotlinStdlib)
    expectedBy(project(":kotlinx-logger-simple-common"))
    testImplementation(Config.JS.kotlinTest)
}