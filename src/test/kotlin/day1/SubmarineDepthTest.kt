package day1

import java.io.File
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import submarine.attachments.Position
import submarine.attachments.Sonar
import submarine.Submarine

internal class SubmarineDepthTest {

    private val testSubmarine: Submarine = Submarine(Sonar(), Position())

    @Test
    internal fun `check depths with default`() {
        val depths = File("src/test/resources/day1/input.txt").readLines().map { it.toInt() }

        val actual = testSubmarine.scan(depths)

        assertEquals(8, actual)
    }

    @Test
    internal fun `check depths - with window`() {
        val depths = File(pathname).readLines().map { it.toInt() }

        val actual = testSubmarine.scan(depths, 3)

        assertEquals(4, actual)
    }

    companion object {
        private const val pathname = "src/test/resources/day1/input.txt"
    }
}