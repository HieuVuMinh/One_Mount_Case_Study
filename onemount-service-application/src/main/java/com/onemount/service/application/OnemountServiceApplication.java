package com.onemount.service.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication(scanBasePackages =
        {"com.onemount.service.application", "com.onemount.service.business", "com.onemount.service.infrastructure"})
@ComponentScan("com.onemount.*")
public class OnemountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnemountServiceApplication.class, args);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);
    }

//    @Bean
//    public GroupedOpenApi groupOpenApi() {
//        String paths[] = {"/v1/projects/**"};
//        String packagesToscan[] = {"com.onemount.service.application"};
//        return GroupedOpenApi.builder().pathsToMatch(paths).packagesToScan(packagesToscan)
//                .build();
//    }
}
