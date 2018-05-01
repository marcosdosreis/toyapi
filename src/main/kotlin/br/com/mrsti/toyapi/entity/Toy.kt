package br.com.mrsti.toyapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Toy(@Id var id: String?,
               var description: String,
               var brand: String,
               var minAge: Int)
