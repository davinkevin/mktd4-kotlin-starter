import util.Player

/**
 * Exercise 3 : Nullable & Safe Cast.
 *
 * Read About @see <a href="http://kotlinlang.org/docs/reference/null-safety.html"></a> and
 */

/**
 * return the player score or 0 using one line syntax and if operator
 */
fun getPlayerScoreUsingIf(player: Player?): Int = if (player?.score != null) player.score!! else 0


/**
 * return the player score or 0 using one line syntax and elvis operator
 */
fun getPlayerScoreUsingElvis(player: Player?): Int = player?.score ?: 0


/**
 * return the player score.
 */
fun trustMeAndReturnScore(player: Player?): Int = player?.score!!

/**
 * Cast the @param arg to Int and return its value or 0 if it's not an Int
 */
fun anyToInt(arg: Any?): Int = arg as? Int ?: 0


