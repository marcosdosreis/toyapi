package br.com.mrsti.toyapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ToyapiApplication

fun main(args: Array<String>) {
    SpringApplication.run(ToyapiApplication::class.java, *args)
}
