package io.jkratz.kotlin.extensions

import org.junit.Test
import java.lang.NullPointerException
import java.util.*

class OptionalExtensionsTest {

    @Test
    fun testUnwrap() {
        val javaOptional = Optional.of("HELLO")
        val kotlinOptional: String? = javaOptional.unwrap()
        assert(kotlinOptional == "HELLO")

        val emptyOptional: Optional<String> = Optional.empty()
        val kEmptyOptional: String? = emptyOptional.unwrap()
        assert(kEmptyOptional == null)
    }

    @Test(expected = NullPointerException::class)
    fun testForceUnwrap() {
        val javaOptional = Optional.of("HELLO")
        val kotlinOptional = javaOptional.forceUnwrap()
        assert(kotlinOptional == "HELLO")

        val emptyOptional: Optional<String> = Optional.empty()
        val kEmptyOptional = emptyOptional.forceUnwrap()
        assert(kEmptyOptional == null)
    }

    @Test
    fun testWrapAsOptional() {

        val nullableName: String? = null
        val name: String = "Bobo"

        val optionalName1 = nullableName.wrapAsOptional()
        val optionalName2 = name.wrapAsOptional()

        assert(!optionalName1.isPresent)
        assert(optionalName2.isPresent)
        assert(optionalName2.get() == "Bobo")
    }
}