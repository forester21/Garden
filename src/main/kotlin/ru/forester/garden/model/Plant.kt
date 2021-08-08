package ru.forester.garden.model

import org.springframework.data.annotation.Id

data class Plant(
        @Id
        val name: String,
        val description: String,
        val version: String
)
