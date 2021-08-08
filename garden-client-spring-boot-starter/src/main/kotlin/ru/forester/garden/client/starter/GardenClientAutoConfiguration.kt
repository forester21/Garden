package ru.forester.garden.client.starter

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.forester.garden.client.GardenClient

@Configuration
@ConditionalOnClass(GardenClient::class)
@EnableConfigurationProperties(GardenClientProperties::class)
class GardenClientAutoConfiguration(val properties: GardenClientProperties) {

    @Bean
    @ConditionalOnMissingBean
    fun gardenClient() = GardenClient(properties.baseUrl)
}