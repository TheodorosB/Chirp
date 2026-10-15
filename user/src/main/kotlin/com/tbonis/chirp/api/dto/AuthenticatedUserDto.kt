package com.tbonis.chirp.api.dto

import com.tbonis.chirp.domain.model.User

data class AuthenticatedUserDto(
    val user: UserDto,
    val accessToken: String,
    val refreshToken: String,
)