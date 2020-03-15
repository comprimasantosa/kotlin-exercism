import kotlin.math.sqrt

object Darts {

    fun score(x: Any, y: Any /* choose proper types! */): Int {
        val doubleX = x.toString().toDouble()
        val doubleY = y.toString().toDouble()
        val phytagorasResult = sqrt(doubleX * doubleX + doubleY * doubleY)

        return if (phytagorasResult <= 1.0) {
            10
        } else if (phytagorasResult <= 5.0) {
            5
        } else if (phytagorasResult <= 10.0) {
            1
        } else 0
    }
}