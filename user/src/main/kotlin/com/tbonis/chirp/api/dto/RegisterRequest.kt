package com.tbonis.chirp.api.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.Length

data class RegisterRequest(
    @field:NotBlank
    @field:Email(message = "Must be a valid email address")
    val email: String,
    @field:Length(min = 3, max = 12, message = "Username must be between 3 and 12 characters")
    val username: String,
    @field:Size(
        min = 12,
        message = "Password must be at least 12 characters long"
    )
    val password: String
)
