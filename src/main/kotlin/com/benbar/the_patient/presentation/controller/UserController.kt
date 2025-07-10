package com.benbar.the_patient.presentation.controller


import com.benbar.the_patient.domain.model.User
import com.benbar.the_patient.domain.usecase.RegisterUserUseCase
import com.benbar.the_patient.presentation.response.UserResponse
import com.benbar.the_patient.presentation.request.RegisterRequest
import org.springframework.http.ResponseEntity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
@RequestMapping("/api/auth")
class AuthController(
    private val registerUserUseCase: RegisterUserUseCase
) {
    @PostMapping("/register")
    fun register(@RequestBody request: RegisterRequest): ResponseEntity<UserResponse> {
        val user = User(
            id = 0,
            firstName = request.firstName,
            lastName = request.lastName,
            phone = request.phone,
            dateOfBirth = request.dateOfBirth,
            gender = request.gender,
            address = request.address,
            city = request.city,
            profileImage = null,
            isActive = true,
            updatedAt = LocalDateTime.now(),
            email = request.email,
            passwordHash = hashPassword(request.password),
            role = "patient",
            createdAt = LocalDateTime.now()
        )
        val savedUser = registerUserUseCase.execute(user)
        return ResponseEntity.ok(UserResponse.from(savedUser))
    }

    private fun hashPassword(password: String): String {
        return BCryptPasswordEncoder().encode(password)
    }
}
