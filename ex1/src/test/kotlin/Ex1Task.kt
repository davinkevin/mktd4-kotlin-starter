/**
 * Exercise 1 : Classes, Data Classes, Object and companions
 *
 * Read about @see <a href="https://kotlinlang.org/docs/reference/classes.html">Classes<a/>
 */

/**
 * Task 1:
 * Write the kotlin class equivalent to this java class, using one line
 *
 * public class Player {
 *    private final int id;
 *    private final String name;
 *
 *    public Player(int id, String name) {
 *        this.id = id;
 *        this.name = name;
 *    }
 *
 *    public String getName() {
 *        return name;
 *    }
 *
 *   public int getId() {
 *    return id;
 *    }
 * }
 */

data class Player(val id: Int, val name: String)

/**
 * Task 2:
 * Consider that enum. Add a "static" function to find the Move by the letter.
 * And here is the function : fun from(value: String) = Move.values().firstOrNull { it.id == value } ?: NONE
 */

enum class Move(val id: String) {
    NORTH("N"),
    SOUTH("S"),
    WEST("W"),
    EAST("E"),
    NONE("O");

    companion object{
        fun from(value: String) = Move.values().firstOrNull { it.id == value } ?: NONE
    }
}