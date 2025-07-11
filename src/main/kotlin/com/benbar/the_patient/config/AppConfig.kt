package com.benbar.the_patient.config

import com.benbar.the_patient.data.repository.UserRepositoryImpl
import com.benbar.the_patient.domain.repository.UserRepository
import com.benbar.the_patient.domain.usecase.LoginUserUseCase
import com.benbar.the_patient.domain.usecase.RegisterUserUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder


@Configuration
class AppConfig {

    @Bean
    fun loginUserUseCase(userRepository: UserRepository): LoginUserUseCase =
        LoginUserUseCase(userRepository)

    @Bean
    fun registerUserUseCase(userRepository: UserRepository): RegisterUserUseCase =
        RegisterUserUseCase(userRepository)

    @Bean
    fun userRepository(impl: UserRepositoryImpl): UserRepository = impl

    @Bean
    fun passwordEncoder(): BCryptPasswordEncoder = BCryptPasswordEncoder()
}