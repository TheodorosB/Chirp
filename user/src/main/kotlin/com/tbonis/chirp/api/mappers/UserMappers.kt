package com.tbonis.chirp.api.mappers

import com.tbonis.chirp.api.dto.AuthenticatedUserDto
import com.tbonis.chirp.api.dto.UserDto
import com.tbonis.chirp.domain.model.AuthenticatedUser
import com.tbonis.chirp.domain.model.User

fun AuthenticatedUser.toAuthenticatedUserDto(): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken
    )
}

fun User.toUserDto(): UserDto {
    return UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified,
    )
}