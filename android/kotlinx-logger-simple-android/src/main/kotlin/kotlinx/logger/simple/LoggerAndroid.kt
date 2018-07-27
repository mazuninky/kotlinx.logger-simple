package kotlinx.logger.simple

import android.util.Log

actual inline fun debug(tag: String, cause: Throwable?, message: () -> String) {
    if(cause != null)
        Log.d(tag, message(), cause)
    else
        Log.d(tag, message())
}


actual inline fun error(tag: String, cause: Throwable?, message: () -> String) {
    if(cause != null)
        Log.e(tag, message(), cause)
    else
        Log.e(tag, message())
}

actual inline fun warning(tag: String, cause: Throwable?, message: () -> String) {
    if(cause != null)
        Log.w(tag, message(), cause)
    else
        Log.w(tag, message())
}

actual inline fun verbose(tag: String, cause: Throwable?, message: () -> String) {
    if(cause != null)
        Log.v(tag, message(), cause)
    else
        Log.v(tag, message())
}

actual inline fun information(tag: String, cause: Throwable?, message: () -> String) {
    if(cause != null)
        Log.i(tag, message(), cause)
    else
        Log.i(tag, message())
}

actual inline fun wtf(tag: String, cause: Throwable?, message: () -> String) {
    if(cause != null)
        Log.wtf(tag, message(), cause)
    else
        Log.wtf(tag, message())
}