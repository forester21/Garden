package ru.forester.garden.client.starter

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "garden.client")
data class GardenClientProperties(val baseUrl: String)
