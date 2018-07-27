@file:Suppress("NOTHING_TO_INLINE")

package kotlinx.logger.simple

expect inline fun debug(tag: String, cause: Throwable?, message: () -> String)

expect inline fun error(tag: String, cause: Throwable?, message: () -> String)

expect inline fun warning(tag: String, cause: Throwable?, message: () -> String)

expect inline fun verbose(tag: String, cause: Throwable?, message: () -> String)

expect inline fun information(tag: String, cause: Throwable?, message: () -> String)

expect inline fun wtf(tag: String, cause: Throwable?, message: () -> String)

// log { message }
inline fun debug(noinline message: () -> String) {
    debug(DEBUG_TAG, null, message)
}

inline fun error(noinline message: () -> String) {
    error(ERROR_TAG, null, message)
}

inline fun warning(noinline message: () -> String) {
    warning(WARNING_TAG, null, message)
}

inline fun verbose(noinline message: () -> String) {
    verbose(VERBOSE_TAG, null, message)
}

inline fun information(noinline message: () -> String) {
    information(INFORMATION_TAG, null, message)
}

inline fun wtf(noinline message: () -> String) {
    wtf(WTF_TAG, null, message)
}

// log(tag) { message }
inline fun debug(tag: String, noinline message: () -> String) {
    debug(tag, null, message)
}

inline fun error(tag: String, noinline message: () -> String) {
    error(tag, null, message)
}

inline fun warning(tag: String, noinline message: () -> String) {
    warning(tag, null, message)
}

inline fun verbose(tag: String, noinline message: () -> String) {
    verbose(tag, null, message)
}

inline fun information(tag: String, noinline message: () -> String) {
    information(tag, null, message)
}

inline fun wtf(tag: String, noinline message: () -> String) {
    wtf(tag, null, message)
}

// log(exception) { message }
inline fun debug(cause: Throwable, noinline message: () -> String) {
    debug(DEBUG_TAG, cause, message)
}

inline fun error(cause: Throwable, noinline message: () -> String) {
    error(ERROR_TAG, cause, message)
}

inline fun warning(cause: Throwable, noinline message: () -> String) {
    warning(WARNING_TAG, cause, message)
}

inline fun verbose(cause: Throwable, noinline message: () -> String) {
    verbose(VERBOSE_TAG, cause, message)
}

inline fun information(cause: Throwable, noinline message: () -> String) {
    information(INFORMATION_TAG, cause, message)
}

inline fun wtf(cause: Throwable, noinline message: () -> String) {
    wtf(WTF_TAG, cause, message)
}

// l { message }
inline fun d(noinline message: () -> String) {
    debug(message)
}

inline fun e(noinline message: () -> String) {
    error(message)
}

inline fun w(noinline message: () -> String) {
    warning(message)
}

inline fun v(noinline message: () -> String) {
    verbose(message)
}

inline fun i(noinline message: () -> String) {
    information(message)
}

// l(exception) { message }
inline fun d(cause: Throwable, noinline message: () -> String) {
    debug(cause, message)
}

inline fun e(cause: Throwable, noinline message: () -> String) {
    error(cause, message)
}

inline fun w(cause: Throwable, noinline message: () -> String) {
    warning(cause, message)
}

inline fun v(cause: Throwable, noinline message: () -> String) {
    verbose(cause, message)
}

inline fun i(cause: Throwable, noinline message: () -> String) {
    information(cause, message)
}

// constants

const val DEBUG_TAG = "[DEBUG]"
const val ERROR_TAG = "[ERROR]"
const val WARNING_TAG = "[WARNING]"
const val VERBOSE_TAG = "[VERBOSE]"
const val INFORMATION_TAG = "[INFORMATION]"
const val WTF_TAG = "[INFORMATION]"