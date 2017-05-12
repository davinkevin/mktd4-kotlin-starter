package io.monkeypatch.mktd4.ex6

/**
 * Exercise 6: Arguments, Default, Named
 *
 * Read about @see <a href="http://kotlinlang.org/docs/reference/functions.html#default-arguments"></a>
 */

/**
 * Default and named arguments help to minimize the number of overloads and improve the readability of the function invocation. The library function joinToString is declared with default values for parameters:
 *  fun joinToString(
 *   separator: String = ", ",
 *   prefix: String = "",
 *   postfix: String = "",
 *  ): String
 * It can be called on a collection of Strings. Specifying only two arguments make the function joinOptions() return the list in a JSON format (e.g., "[a, b, c]")
 */
fun joinOptions(options: Collection<String>) = options.joinToString(
        ", ", "[", "]"
)

/**
 * Complete the function to use var arguments.
 *
 * Read about @see <a href="https://kotlinlang.org/docs/reference/functions.html#variable-number-of-arguments-varargs">Variable number of arguments</a>
 */
fun joinVarArgsOptions(vararg args: String) = joinOptions(args.toList())
