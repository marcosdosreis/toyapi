package br.com.mrsti.toyapi.repository

import br.com.mrsti.toyapi.entity.Toy
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ToyRepository : MongoRepository<Toy, String> {

    fun findByDescriptionContaining(description: String) : List<Toy>

    fun findByBrandContaining(brand: String) : List<Toy>

}