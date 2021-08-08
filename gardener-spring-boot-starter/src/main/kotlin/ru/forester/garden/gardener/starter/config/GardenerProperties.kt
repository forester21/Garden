package ru.forester.garden.gardener.starter.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import ru.forester.garden.gardener.dto.Plant

@ConstructorBinding
@ConfigurationProperties(prefix = "gardener")
data class GardenerProperties(
        val client: ClientProperties,
        val plant: Plant)

data class ClientProperties(val baseUrl: String)
