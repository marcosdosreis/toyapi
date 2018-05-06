package br.com.mrsti.toyapi.controller

import br.com.mrsti.toyapi.entity.LoginRequest
import br.com.mrsti.toyapi.entity.LoginResponse
import br.com.mrsti.toyapi.entity.User
import br.com.mrsti.toyapi.service.LoginService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/login")
class LoginController {

    @Autowired
    lateinit var loginService: LoginService

    @PostMapping
    fun login(@RequestBody loginRequest: LoginRequest) : ResponseEntity<LoginResponse> {
        var response: LoginResponse = loginService.Login(loginRequest)
        if (response.errorMessage == null) {
            return ResponseEntity(response, HttpStatus.OK)
        }
        else {
            return ResponseEntity(response, HttpStatus.UNAUTHORIZED)
        }
    }
}