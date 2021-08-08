package ru.forester.garden.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestService1Application

fun main(args: Array<String>) {
    runApplication<TestService1Application>(*args)
}