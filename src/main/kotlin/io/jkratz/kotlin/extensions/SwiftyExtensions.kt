package io.jkratz.kotlin.extensions

/**
 * Provides Swift like guard functionality in Kotlin. Like Swift the block is
 * executed when the reference is NULL, otherwise it returns the value unwrapped.
 * Unlike Swift multiple conditionals cannot be chained.
 *
 */
inline fun<T> T?.guard(block: () -> Nothing): T {
    return this ?: block()
}

fun<T> T?.unwrap(): T {
    //if (this == null) throw kotlin.IllegalStateException()
    return this!!
}