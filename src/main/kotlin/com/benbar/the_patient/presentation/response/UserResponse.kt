package com.benbar.the_patient.presentation.response

import com.benbar.the_patient.domain.model.User

data class UserResponse(
    val id: Int,
    val fullName: String,
    val email: String,
    val role: String
) {
    companion object {
        fun from(user: User) = UserResponse(
            user.id,
            "${user.firstName} ${user.lastName}",
            user.email,
            user.role
        )
    }
}