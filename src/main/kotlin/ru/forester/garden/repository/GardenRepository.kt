package ru.forester.garden.repository

import org.springframework.data.mongodb.repository.MongoRepository
import ru.forester.garden.model.Plant

interface GardenRepository : MongoRepository<Plant, String>