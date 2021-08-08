package ru.forester.garden.gardener

import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*
import io.ktor.http.*
import ru.forester.garden.gardener.dto.Plant

class Gardener(private val baseUrl: String) {

    private val httpClient = HttpClient {
        install(JsonFeature)
    }

    suspend fun putPlant(plant: Plant){
        httpClient.post<Unit>("$baseUrl/garden/plant") {
            contentType(ContentType.Application.Json)
            body = plant
        }
    }
}