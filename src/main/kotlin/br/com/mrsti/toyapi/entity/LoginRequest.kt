package br.com.mrsti.toyapi.entity

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class LoginRequest(var login: String,
                var password: String)