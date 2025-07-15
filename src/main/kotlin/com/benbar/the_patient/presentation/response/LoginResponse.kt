package com.benbar.the_patient.presentation.response

data class LoginResponse(
    val id: Int,
    val fullName: String,
    val email: String,
    val role: String,
    val message: String
)
