package br.com.mrsti.toyapi.repository

import br.com.mrsti.toyapi.entity.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String> {

    fun findByLogin(login: String) : User?

    fun findByNameContaining(name: String) : List<User>

}