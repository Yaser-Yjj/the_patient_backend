package com.benbar.the_patient.data.repository

import com.benbar.the_patient.data.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserJpaRepository : JpaRepository<UserEntity, Int> {
    fun findByEmail(email: String): UserEntity?
}