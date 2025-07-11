package com.benbar.the_patient.domain.model

import java.time.LocalDate
import java.time.LocalDateTime

data class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val phone: String,
    val dateOfBirth: LocalDate,
    val gender: String,
    val address: String,
    val city: String,
    val profileImage: String?,
    val isActive: Boolean,
    val updatedAt: LocalDateTime,
    val email: String,
    val passwordHash: String,
    val role: String,
    val createdAt: LocalDateTime
)