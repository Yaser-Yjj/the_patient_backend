package com.benbar.the_patient.domain.usecase

import com.benbar.the_patient.domain.exception.InvalidCredentialsException
import com.benbar.the_patient.domain.exception.UserNotFoundException
import com.benbar.the_patient.domain.repository.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class LoginUserUseCase(
    private val userRepository: UserRepository
) {
    private val passwordEncoder = BCryptPasswordEncoder()

    fun execute(email: String, password: String) =
        userRepository.findByEmail(email)?.let { user ->
            if (passwordEncoder.matches(password, user.passwordHash)) {
                user
            } else {
                throw InvalidCredentialsException("Invalid password.")
            }
        } ?: throw UserNotFoundException("User not found with email: $email")
}
