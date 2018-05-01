package br.com.mrsti.toyapi.controller

import br.com.mrsti.toyapi.entity.Toy
import br.com.mrsti.toyapi.service.ToyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/toy")
class ToyController {

    @Autowired
    lateinit var toyService: ToyService

    @GetMapping("/description/{description}")
    fun findByDescription (@PathVariable(value = "description") description : String) : List<Toy> {
        return toyService.findToyByDescription(description)
    }

    @GetMapping("/brand/{brand}")
    fun findByBrand (@PathVariable(value = "brand") brand : String) : List<Toy> {
        return toyService.findToyByBrand(brand)
    }

    @GetMapping
    fun findAll() : List<Toy> {
        return toyService.findAllToys()
    }

    @DeleteMapping("/id/{id}")
    fun delete(@PathVariable(value = "id") id : String) {
        toyService.delete(id)
    }

    @PostMapping
    fun save(@RequestBody toy: Toy) {
        toyService.save(toy)
    }

}
