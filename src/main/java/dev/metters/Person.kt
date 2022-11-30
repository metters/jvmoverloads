package dev.metters

data class Person @JvmOverloads constructor(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val city: String? = null,
)
