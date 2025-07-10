package com.benbar.the_patient.data.repository

import com.benbar.the_patient.domain.model.User
import com.benbar.the_patient.domain.repository.UserRepository
import com.benbar.the_patient.data.mapper.*
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    private val jpaRepository: UserJpaRepository
) : UserRepository {
    override fun findByEmail(email: String): User? = jpaRepository.findByEmail(email)?.toDomain()
    override fun save(user: User): User = jpaRepository.save(user.toEntity()).toDomain()
}
