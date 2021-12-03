package day2

import submarine.attachments.Sonar
import submarine.Submarine
import java.io.File
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import submarine.attachments.Position

internal class SubmarineDiveTest {

    private val testSubmarine = Submarine(Sonar(), Position())

    @Test
    internal fun dive() {
        val depths = File(pathname).readLines()
            .map { Pair(it.split(" ").first(), it.split(" ").last().toInt()) }

        val actual = testSubmarine.dive(depths)

        Assertions.assertEquals(900, actual)
    }

    companion object {
        const val pathname = "src/test/resources/day2/input.txt"
    }
}