package com.tbonis.chirp.infra.database.mappers

import com.tbonis.chirp.domain.model.User
import com.tbonis.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User {
    return User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail
    )
}