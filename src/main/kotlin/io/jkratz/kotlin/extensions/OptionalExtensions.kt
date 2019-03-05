package io.jkratz.kotlin.extensions

import java.util.Optional

/**
 * Converts Java Optional<T> to T?
 */
fun<T> Optional<T>.unwrap(): T? = orElse(null)

/**
 * Converts Java Optional<T> to T, if Optional is empty/NULL a NullPointerException
 * is thrown.
 */
@Throws(NullPointerException::class)
fun<T> Optional<T>.forceUnwrap(): T = orElseThrow { NullPointerException() }

/**
 * Creates a Java Optional<T> from a Kotlin type
 */
fun<T> T?.wrapAsOptional(): Optional<T> {
    return Optional.ofNullable(this)
}