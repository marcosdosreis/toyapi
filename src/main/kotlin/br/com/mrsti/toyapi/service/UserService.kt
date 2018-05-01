package br.com.mrsti.toyapi.service

import br.com.mrsti.toyapi.entity.User
import br.com.mrsti.toyapi.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun findAllUsers() : List<User> {
        return userRepository.findAll()
    }

    fun findUserByLogin(login: String) : List<User> {
        return userRepository.findByLogin(login)
    }

    fun findUserByName(name: String) : List<User> {
        return userRepository.findByNameContaining(name)
    }

    fun save(user: User) {
        userRepository.save(user)
    }
}