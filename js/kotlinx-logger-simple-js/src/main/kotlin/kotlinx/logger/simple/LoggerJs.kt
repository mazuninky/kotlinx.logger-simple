package kotlinx.logger.simple

actual inline fun debug(tag: String, cause: Throwable?, message: () -> String) {
    console.log("$tag: ${message()}${if (cause != null) " with exception $cause" else ""}")
}

actual inline fun error(tag: String, cause: Throwable?, message: () -> String) {
    console.log("$tag: ${message()}${if (cause != null) " with exception $cause" else ""}")
}

actual inline fun warning(tag: String, cause: Throwable?, message: () -> String) {
    console.log("$tag: ${message()}${if (cause != null) " with exception $cause" else ""}")
}

actual inline fun verbose(tag: String, cause: Throwable?, message: () -> String) {
    console.log("$tag: ${message()}${if (cause != null) " with exception $cause" else ""}")
}

actual inline fun information(tag: String, cause: Throwable?, message: () -> String) {
    console.log("$tag: ${message()}${if (cause != null) " with exception $cause" else ""}")
}

actual inline fun wtf(tag: String, cause: Throwable?, message: () -> String) {
    console.log("$tag: ${message()}${if (cause != null) " with exception $cause" else ""}")
}