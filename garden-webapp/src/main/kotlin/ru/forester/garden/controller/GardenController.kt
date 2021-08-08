package ru.forester.garden.controller

import org.springframework.web.bind.annotation.*
import ru.forester.garden.service.GardenService
import ru.forester.garden.model.Plant

@RestController
@RequestMapping("/garden")
class GardenController(private val gardenService: GardenService) {

    @PostMapping("/plant")
    fun plant(@RequestBody plant: Plant) = gardenService.plant(plant)

    @GetMapping
    fun getGarden(): List<Plant> = gardenService.getGarden()
}