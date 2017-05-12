
import util.Player
import util.Position
import util.isValid

/**
 * Exercise 8: Collections
 *
 * Read about <a href="http://kotlinlang.org/docs/reference/collections.html"></a>
 */

fun getEmptySetOfPlayers(): Set<Player> = emptySet()

fun getEmptyListOfPlayers(): List<Player> = emptyList()

/**
 * Filter players with score 0.
 */
fun getPlayersWithScore0(players: List<Player>): List<Player> = players.filter {
    it.score != 0
}

/**
 * Return true if all players have a score not null
 */
fun checkAllPlayersHaveAScore(players: List<Player>): Boolean = players.all {
    it.score != null
}

/**
 * Return true if there is at least one player with the score 10
 */
fun checkContainsPlayerWithScore10(players: List<Player>): Boolean = players.any {
    it.score == 10
}

/**
 * Return the number of players with the score 20
 */
fun countPlayersWithScore20(players: List<Player>): Int = players.filter {
    it.score == 20
}.count()

/**
 * Return the first player with the score @param score, or null if there is none
 */
fun findAnyPlayerWithScore(players: List<Player>, score: Int): Player? = players.filter {
    it.score == score
}.firstOrNull()

/**
 * Return the players names without using for or while
 */
fun getPlayersNames(players: List<Player>): Array<String> = players.map(Player::name).toTypedArray()



fun getAllPlayers(games: List<Game>): List<Player> = games.flatMap(Game::players)

/**
 * Return true if there is more valid position than invalid, false otherwise
 * using a maximum two lines line expression.
 *
 * Read about @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/partition.html"></a>
 */
fun isThereMoreValidThanInvalid(vararg positions: Position): Boolean {
    val (valid, invalid) = positions.partition { it.isValid() }
    return valid.size > invalid.size
}





