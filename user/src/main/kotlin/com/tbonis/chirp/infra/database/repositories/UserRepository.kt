package com.tbonis.chirp.infra.database.repositories

import com.tbonis.chirp.infra.database.entities.UserEntity
import com.tbonis.chirp.domain.model.UserId
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, UserId> {
    fun findByEmail(email: String): UserEntity?
    fun findByEmailOrUsername(email: String, username: String): UserEntity?
}