import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    base
}

buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath(Config.BuildPlugins.androidGradle)
        classpath(kotlin("gradle-plugin", version = Config.Versions.kotlin))
    }
}

subprojects {
    repositories {
        jcenter()
        google()
        mavenCentral()
    }
}