package br.com.mrsti.toyapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(@Id var id: String?,
                var login: String,
                var name: String,
                var password: String,
                var token: String?)