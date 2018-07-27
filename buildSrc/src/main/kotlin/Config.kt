object Config {
    object Versions {
        const val kotlin = "1.2.51"
        const val kotlinCoroutines = "0.23.4"
        const val androidGradle = "3.1.0"
        const val junit = "4.12"
    }

    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradle}"
    }

    object Android {
        const val buildToolsVersion = "27.0.3"
        const val minSdkVersion = 19
        const val targetSdkVersion = 27
        const val compileSdkVersion = 27
    }

    object Common {
        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlin}"
        const val kotlinTest = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
        const val kotlinTestAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
    }

    object JVM {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
        const val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        const val kotlinTestJUNIT = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
        const val junit = "junit:junit:${Versions.junit}"
    }

    object JS {
        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-js:${Versions.kotlin}"
        const val kotlinTest = "org.jetbrains.kotlin:kotlin-test-js:${Versions.kotlin}"
    }

    object Libs {
        const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
        const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"
    }
}
