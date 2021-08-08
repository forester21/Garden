package ru.forester.garden.gardener.starter.service

import kotlinx.coroutines.runBlocking
import mu.KLogging
import ru.forester.garden.gardener.Gardener
import ru.forester.garden.gardener.dto.Plant
import javax.annotation.PostConstruct

class GardenerService(
        private val gardener: Gardener,
        private val plant: Plant) {

    @PostConstruct
    fun putPlantOnStartup() = runBlocking {
        try {
            gardener.putPlant(plant)
            logger.info { "Successfully registered service in Garden" }
        } catch (e: Exception) {
            logger.error(e) { "Unable to register service in Garden" }
        }
    }

    companion object : KLogging()
}