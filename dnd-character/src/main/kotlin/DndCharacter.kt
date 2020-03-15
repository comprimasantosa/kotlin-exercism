import kotlin.random.Random
import kotlin.math.floor

class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + DndCharacter.Companion.modifier(constitution)

    companion object {

        fun ability(): Int {
            val diceRoll = mutableListOf<Int>().apply {
                for (i in 1..4) {
                    add(Random.nextInt(1, 6))
                }

                sort()
                remove(first())
            }

            return diceRoll.sum()
        }

        fun modifier(score: Int): Int {
            return floor((score.toDouble() - 10) / 2).toInt()
        }
    }

}