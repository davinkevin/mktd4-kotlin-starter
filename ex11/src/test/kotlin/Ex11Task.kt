import util.Move
import util.Position

/**
 * Exercise 11: Operator Overloading
 *
 * Read about <a href="https://kotlinlang.org/docs/reference/operator-overloading.html">Operator overloading</a>
 *
 */

/**
 * Add a function to the class Position to be able to write Position(0,0) + Move.SOUTH == Position(0,1)
 */

operator fun Position.plus(move: Move): Position =
    when(move) {
        Move.SOUTH -> Position(posX, posY+1)
        Move.NORTH -> Position(posX, posY-1)
        Move.EAST -> Position(posX+1, posY)
        Move.WEST -> Position(posX-1, posY)
        else -> this
    }
