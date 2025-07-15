package com.benbar.the_patient.data.entity

import jakarta.persistence.*
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "users")
data class UserEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String,

    val phone: String,

    @Column(name = "date_of_birth")
    val dateOfBirth: LocalDate,

    val gender: String,
    val address: String,
    val city: String,

    @Column(name = "profile_image")
    val profileImage: String? = null,

    @Column(name = "is_active")
    val isActive: Boolean = true,

    @Column(name = "updated_at")
    val updatedAt: LocalDateTime = LocalDateTime.now(),

    val email: String,

    @Column(name = "password_hash")
    val passwordHash: String,

    val role: String = "patient",

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now()
)