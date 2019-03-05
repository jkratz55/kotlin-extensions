package io.jkratz.kotlin.extensions

import org.junit.Test
import kotlin.IllegalArgumentException

class SwiftyExtensionsTest {

    @Test
    fun testGuard() {

        var firstName: String = "Joe"
        var lastName: String? = "Somebody"
        var middleName: String? = null

        val a: String = firstName.guard { throw IllegalArgumentException() }
        assert(a == "Joe")

        val b: String = lastName.guard { throw IllegalArgumentException() }
        assert(b == "Somebody")

        var exception: Boolean = false
        try{
            val c: String = middleName.guard { throw IllegalArgumentException() }
        } catch (e: IllegalArgumentException) {
            exception = true
        }

        assert(exception)
    }
}