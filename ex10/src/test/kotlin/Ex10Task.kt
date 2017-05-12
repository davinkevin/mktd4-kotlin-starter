import util.Position

/**
 * Exercise 10: Extension Functions
 *
 * Read about <a href="https://kotlinlang.org/docs/reference/extensions.html">Extension Functions</a>
 *
 */

/**
 * Add HERE a function isValid to the class Position
 * A position is valid if posX => 0 and posY >=0
*/
fun Position.isValid() = posX >= 0 && posY >= 0
