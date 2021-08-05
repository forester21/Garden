package ru.forester.garden.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.forester.garden.dto.PlantDTO

@RestController
@RequestMapping("/garden")
class GardenController {

    @GetMapping
    fun getGarden() = listOf(
            PlantDTO("sme-sample-service"),
            PlantDTO("sme-template-service"))
}