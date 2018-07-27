# Kotlinx.logger-simple
Minimal overhead logger with inline functions

### How to use
Message logging
```kotlin
import kotlinx.logger.simple.*

debug { "Your message" }
d { "Your message" }
warning { "Your message" }
w { "Your message" }
info { "Your message" }
i { "Your message" }
```
Message logging with custom tag
```kotlin
import kotlinx.logger.simple.*

debug("Your tag") { "Your message" }
d("Your tag") { "Your message" }
```

Message logging with exception
```kotlin
import kotlinx.logger.simple.*

try {
  ...
} catch (exception: Exception) {
  debug(exception) { "Your message" }
  error(exception) { "Your message" }
}
```

Message logging with exception and tag
```kotlin
import kotlinx.logger.simple.*

try {
  ...
} catch (exception: Exception) {
  debug("Your tag", exception) { "Your message" }
  error("Your tag", exception) { "Your message" }
}
```
### Supported platforms
- Android
- Js
- JVM
- Native
### Planing platforms
- Native/WASM
## Who is using it
- http://tusion.xyz/