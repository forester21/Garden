package ru.forester.garden.service

import org.springframework.stereotype.Service
import ru.forester.garden.model.Plant
import ru.forester.garden.repository.GardenRepository

@Service
class GardenService(private val gardenRepository: GardenRepository) {

    fun putPlant(plant: Plant){
        gardenRepository.save(plant)
    }

    fun getGarden(): List<Plant> = gardenRepository.findAll()
}