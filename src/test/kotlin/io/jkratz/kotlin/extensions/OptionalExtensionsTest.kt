package io.jkratz.kotlin.extensions

import org.junit.Test
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
}