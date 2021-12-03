package submarine

import submarine.attachments.Position
import submarine.attachments.Sonar

class Submarine(
    private val sonar: Sonar,
    private val position: Position
) {

    fun scan(depths: List<Int>, windowSize: Int = 1): Int {
        return sonar.scan(depths, windowSize)
    }

    fun dive(input: List<Pair<String, Int>>): Int {
        return position.calculateCourse(input)
    }
}

