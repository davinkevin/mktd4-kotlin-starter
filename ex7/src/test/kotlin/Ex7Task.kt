package io.monkeypatch.mktd4.ex7

/**
 * Exercise 7: Lambdas
 *
 * Read about <a href="http://kotlinlang.org/docs/reference/lambdas.html"></a>
 */


/**
 * Pass a lambda to any function to check if the collection contains an even number.
 * The function any gets a predicate as an argument and returns true if there is at least one element satisfying the predicate.
 */
fun containsEven(collection: Collection<Int>): Boolean = collection.any {
    it % 2 == 0
}