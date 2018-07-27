//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    id("kotlin-platform-jvm")
    id("java-library")
}

kotlin {
    experimental.coroutines = Coroutines.ENABLE
}

dependencies {
    implementation(Config.JVM.kotlinStdlib)
    expectedBy(project(":kotlinx-logger-simple-common"))

    testImplementation(Config.JVM.junit)
    testImplementation(Config.JVM.kotlinTest)
    testImplementation(Config.JVM.kotlinTestJUNIT)
}

/*val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}*/
