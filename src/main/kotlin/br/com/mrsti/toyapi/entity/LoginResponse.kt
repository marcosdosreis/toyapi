package br.com.mrsti.toyapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class LoginResponse(var token: String?,
                         var errorMessage: String?
                         )