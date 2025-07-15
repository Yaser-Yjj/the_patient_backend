package com.benbar.the_patient.data.mapper

import com.benbar.the_patient.data.entity.UserEntity
import com.benbar.the_patient.domain.model.User

fun UserEntity.toDomain() = User(
    id, firstName, lastName, phone, dateOfBirth, gender, address, city,
    profileImage, isActive, updatedAt, email, passwordHash, role, createdAt
)

fun User.toEntity() = UserEntity(
    id, firstName, lastName, phone, dateOfBirth, gender, address, city,
    profileImage, isActive, updatedAt, email, passwordHash, role, createdAt
)