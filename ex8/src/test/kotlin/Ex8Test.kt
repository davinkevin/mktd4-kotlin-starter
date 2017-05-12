import org.junit.Assert
import org.junit.Test
import util.Player
import util.Position


class Ex8Test {

    val PLAYER_1 = Player(1, "Player 1", 10)
    val PLAYER_2 = Player(2, "Player 2", 20)
    val PLAYER_3 = Player(3, "Player 3", 0)
    val PLAYER_4 = Player(4, "Player 4", 5)
    val PLAYER_5 = Player(5, "Player 5", 20)

    val PLAYERS = listOf<Player>(
            PLAYER_1, PLAYER_2, PLAYER_3, PLAYER_4, PLAYER_5
    )

    @Test
    fun testEmptySet() {
        Assert.assertTrue(getEmptySetOfPlayers() is Set<Player>)
        Assert.assertTrue(getEmptySetOfPlayers().isEmpty())
    }

    @Test
    fun testEmptyList() {
        Assert.assertTrue(getEmptyListOfPlayers() is List<Player>)
        Assert.assertTrue(getEmptyListOfPlayers().isEmpty())
    }

    @Test
    fun testFilterPlayersWith0Score() {
        Assert.assertEquals("Player list size should be 1", 4, getPlayersWithScore0(PLAYERS).size)
        Assert.assertFalse("Player PLAYER_3 should not be part of the list", getPlayersWithScore0(PLAYERS).contains(PLAYER_3))
    }

    @Test fun testAllCustomersAreFromCity() {
        Assert.assertTrue(checkAllPlayersHaveAScore(PLAYERS))
    }

    @Test fun testAnyCustomerIsFromCity() {
        Assert.assertTrue(checkContainsPlayerWithScore10(PLAYERS))
    }

    @Test fun testCountCustomersFromCity() {
        Assert.assertEquals(2, countPlayersWithScore20(PLAYERS))
    }

    @Test fun testAnyCustomerFromCity() {
        Assert.assertEquals(PLAYER_2, findAnyPlayerWithScore(PLAYERS, 20))
        Assert.assertNull(findAnyPlayerWithScore(PLAYERS, 50))
    }

    @Test fun shouldListPlayersNames() {
        val names = arrayOf("Player 1", "Player 2", "Player 3", "Player 4", "Player 5")
        Assert.assertArrayEquals(names, getPlayersNames(PLAYERS))
    }

    @Test fun shouldListPlayers() {
        Assert.assertEquals(PLAYERS.size, getAllPlayers(listOf(Game(PLAYERS))).size)
    }

    @Test fun testIsThereMoreValidThanInvalid() {
        Assert.assertEquals(isThereMoreValidThanInvalid(Position(1, 2), Position(0, 0), Position(-1, 2)), true)
        Assert.assertEquals(isThereMoreValidThanInvalid(Position(1, 2), Position(0, -1), Position(-1, 2)), false)
    }

}

data class Game(val players: List<Player>)