import util.Player

/**
 *
 * Exercise 4 : String and String Templates
 *
 * Read about @see <a href="http://kotlinlang.org/docs/reference/basic-types.html#string-literals"></a> to learn about String literals
 */

/**
 * return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor."
 * using 1 line per sentence
 */
fun getLoremIpsum() = """Lorem ipsum dolor sit amet, consectetur adipiscing elit.
Sed non risus.
Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor."""

/**
 * Return the string "The score for %playerName% is %playerScore%
 * return 0 for score if score is null
 */
fun getPlayerScoreAsString(player: Player) = "The score for ${player.name} is ${player.score}"



