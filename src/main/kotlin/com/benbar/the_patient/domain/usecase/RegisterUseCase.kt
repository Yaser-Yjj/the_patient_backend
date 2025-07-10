package com.benbar.the_patient.domain.usecase

import com.benbar.the_patient.domain.model.User
import com.benbar.the_patient.domain.repository.UserRepository

class RegisterUserUseCase(
    private val userRepository: UserRepository
) {
    fun execute(user: User): User {
        return userRepository.save(user)
    }
}