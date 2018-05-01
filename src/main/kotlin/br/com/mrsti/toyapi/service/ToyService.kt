package br.com.mrsti.toyapi.service

import br.com.mrsti.toyapi.entity.Toy
import br.com.mrsti.toyapi.repository.ToyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ToyService {

    @Autowired
    lateinit var toyRepository: ToyRepository

    fun findAllToys() : List<Toy> {
        return toyRepository.findAll()
    }

    fun findToyByBrand(brand: String) : List<Toy> {
        return toyRepository.findByBrandContaining(brand)
    }

    fun findToyByDescription(description: String) : List<Toy> {
        return toyRepository.findByDescriptionContaining(description)
    }

    fun delete(id: String) {
        toyRepository.deleteById(id)
    }

    fun save(toy: Toy) {
        toyRepository.save(toy)
    }
}