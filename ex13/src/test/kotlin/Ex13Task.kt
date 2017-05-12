import util.Position
import util.isValid

/**
 * Exercise 13: Inline and reified
 *
 * Read about <a href="https://kotlinlang.org/docs/reference/inline-functions.html">Inline function and Reified Type</a>
 *
 */

/**
 * Remember the latest task for Ex8.
 *  Write an inline function "and" and use it to complete the function isThereMoreValidThanInvalid using a single Line
 *
 */
inline fun <T, R> T.and(block: (T) -> R): R = block(this)

fun isThereMoreValidThanInvalid(vararg positions:Position)=
        positions.partition { it.isValid() }.and { it.first.size>it.second.size }

/**
 * BTW, "and" function is already there in kotlin, his name is let
 *
 * You know that in Java it is not easy to get the generic parameter type of a class.
 * In Kotlin the keyword reified do it for you
 * Write a function "isDataType" that return true if the calling type is a data type
 */

inline fun <reified T> T.isDataType() =T::class.isData



