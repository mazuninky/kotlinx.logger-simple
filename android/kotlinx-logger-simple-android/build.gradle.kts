//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
  id("com.android.library")
    id("kotlin-platform-android")
}

kotlin {
    experimental.coroutines = Coroutines.ENABLE
}
android {
  compileSdkVersion(Config.Android.compileSdkVersion)
  defaultConfig {
      minSdkVersion(Config.Android.minSdkVersion)
      targetSdkVersion(Config.Android.targetSdkVersion)
    }
  sourceSets {
        getByName("main") {
            java.srcDirs("src/main/kotlin")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib", version =  Config.Versions.kotlin))
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
