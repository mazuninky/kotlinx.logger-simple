import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("kotlin-platform-common")
}

dependencies {
    implementation(Config.Common.kotlinStdlib)
    testImplementation(Config.Common.kotlinTest)
    testImplementation(Config.Common.kotlinTestAnnotations)
}