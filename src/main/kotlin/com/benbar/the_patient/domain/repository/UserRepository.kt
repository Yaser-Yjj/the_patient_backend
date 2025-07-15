package com.benbar.the_patient.domain.repository

import com.benbar.the_patient.domain.model.User


interface UserRepository {
    fun findByEmail(email: String): User?
    fun save(user: User): User
}