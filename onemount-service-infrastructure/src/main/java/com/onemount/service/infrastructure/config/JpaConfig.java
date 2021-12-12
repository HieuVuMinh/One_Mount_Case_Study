package com.onemount.service.infrastructure.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaAuditing(auditorAwareRef = "auditorAwareProvider")
@EnableJpaRepositories(basePackages = {"com.onemount.*"})
@EntityScan(basePackages = {"com.onemount.*"})
public class JpaConfig {
    @Bean
    public AuditorAwareProvider auditorAwareProvider() {
        return new AuditorAwareProvider();
    }

}
