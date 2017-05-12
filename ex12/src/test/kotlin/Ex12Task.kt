/**
 * Exercise 12: Exceptions and type Alias
 *
 * Read about <a href="https://kotlinlang.org/docs/reference/exceptions.html">Exceptions</a>
 *
 */

/**
 * Consider this Exception and that TypeAlias
 */

class FormatException(message: String) : Exception(message)

typealias NANException = FormatException

/**
 * Complete these two functions.
 */
fun parseInt(value: String): Int = try { value.toInt()} catch (e: NumberFormatException) {notANumber()}

fun notANumber(): Nothing = throw NANException("Not a valid number !!")



