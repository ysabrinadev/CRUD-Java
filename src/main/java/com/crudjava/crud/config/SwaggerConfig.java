package com.crudjava.crud.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
    public OpenAPI swaggerOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                .title("API CRUD JAVA")
                .version("1.0.0")
                .description("Documentation Api From Crud"));
    }
    
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi
                .builder()
                .group("public")
                .pathsToMatch("/**")
                .build();
    }
}
