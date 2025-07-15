package com.benbar.the_patient.presentation.request

import java.time.LocalDate

data class RegisterRequest(
    val firstName: String,
    val lastName: String,
    val phone: String,
    val dateOfBirth: LocalDate,
    val gender: String,
    val address: String,
    val city: String,
    val email: String,
    val password: String
)