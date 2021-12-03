package submarine.attachments

class Sonar {
    fun scan(depths: List<Int>, windowSize: Int = 1): Int {
        var totalIncreases = 0
        depths.forEachIndexed { index, _ ->
            if (getWindowTotal(depths, index, windowSize) < getWindowTotal(depths, index + 1, windowSize)) totalIncreases += 1
        }
        return totalIncreases
    }

    private fun getWindowTotal(depths: List<Int>, index: Int, windowSize: Int = 1): Int {
        val range: IntRange = (0 until windowSize)
        return range.mapNotNull { depths.elementAtOrNull(index + it) }.sum()
    }
}