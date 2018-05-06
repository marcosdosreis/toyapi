package br.com.mrsti.toyapi.service

import br.com.mrsti.toyapi.entity.LoginRequest
import br.com.mrsti.toyapi.entity.LoginResponse
import br.com.mrsti.toyapi.entity.User
import br.com.mrsti.toyapi.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LoginService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun Login(request: LoginRequest) : LoginResponse {

        var user: User? = userRepository.findByLogin(request.login)
        var response = LoginResponse(null, null)

        if (user == null) {
            response.errorMessage = "Usuário e/ou senha inválidos."
            return response
        }

        if (user.password != request.password) {
            response.errorMessage = "Usuário e/ou senha inválidos."
            return response
        }
        return response
    }
}