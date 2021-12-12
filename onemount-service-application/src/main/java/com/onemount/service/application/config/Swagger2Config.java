package com.onemount.service.application.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class Swagger2Config {

    @Bean
    public GroupedOpenApi groupOpenApi() {
        String paths[] = {"/v1/projects/**"};
        String packagesToscan[] = {"com.onemount.service.application.controllers"};
        return GroupedOpenApi.builder().group("groups").pathsToMatch(paths).packagesToScan(packagesToscan)
                .build();
    }
}
