pluginManagement {
    plugins {
        // Spring
        id("org.springframework.boot") version "2.5.3"
        id("io.spring.dependency-management") version "1.0.11.RELEASE"
        kotlin("plugin.spring") version "1.5.21"

        // Kotlin
        kotlin("jvm") version "1.5.21"
    }
}

rootProject.name = "garden"
include("garden-webapp")
include("gardener")
include("gardener-spring-boot-starter")

include("test-service-1")