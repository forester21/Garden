package ru.forester.garden

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GardenApplication

fun main(args: Array<String>) {
	runApplication<GardenApplication>(*args)
}
