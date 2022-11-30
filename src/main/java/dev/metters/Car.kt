package dev.metters

import java.time.Year

data class Car(
    val manufacturer: String,
    val production: Year,
    val placeOfRegistration: String? = null,
)
