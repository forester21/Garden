package ru.forester.garden

import org.springframework.stereotype.Service
import ru.forester.garden.model.Plant
import ru.forester.garden.repository.GardenRepository

@Service
class GardenService(private val gardenRepository: GardenRepository) {

    fun plant(plant: Plant){
        gardenRepository.save(plant)
    }

    fun getGarden(): List<Plant> = gardenRepository.findAll()
}