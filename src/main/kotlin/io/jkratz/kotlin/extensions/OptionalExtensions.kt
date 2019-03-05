package io.jkratz.kotlin.extensions

import java.util.Optional

/**
 * Converts Java Optional<T> to T?
 */
fun<T> Optional<T>.unwrap(): T? = orElse(null)

/**
 * Creates a Java Optonal<T> from a Kotlin type
 */
fun<T> T?.wrapAsOptional(): Optional<T> {
    return Optional.ofNullable(this)
}