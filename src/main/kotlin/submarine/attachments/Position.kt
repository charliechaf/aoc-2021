package submarine.attachments

class Position {
    private var horizontal: Int = 0
    private var depth: Int = 0
    private var aim: Int = 0

    fun calculateCourse(input: List<Pair<String, Int>>): Int {
        input.forEach {
            calculateLocation(it)
        }
        return horizontal * depth
    }

    private fun calculateLocation(it: Pair<String, Int>) {
        when (it.first) {
            "forward" -> forward(it.second)
            "up" -> up(it.second)
            "down" -> down(it.second)
        }
    }

    private fun forward(input: Int) {
        horizontal += input
        depth += (aim*input)
    }

    private fun up(input: Int) {
        aim -= input
    }

    private fun down(input: Int) {
        aim += input
    }
}