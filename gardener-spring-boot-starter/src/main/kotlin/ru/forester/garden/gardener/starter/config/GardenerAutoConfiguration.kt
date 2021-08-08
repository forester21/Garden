package ru.forester.garden.gardener.starter.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.forester.garden.gardener.Gardener
import ru.forester.garden.gardener.starter.service.GardenerService

@Configuration
@ConditionalOnClass(Gardener::class)
@EnableConfigurationProperties(GardenerProperties::class)
class GardenerAutoConfiguration(val properties: GardenerProperties) {

    @Bean
    @ConditionalOnMissingBean
    fun gardener() = Gardener(properties.client.baseUrl)

    @Bean
    @ConditionalOnMissingBean
    fun gardenerService() = GardenerService(gardener(), properties.plant)
}