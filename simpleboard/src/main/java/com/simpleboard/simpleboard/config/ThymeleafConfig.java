package com.simpleboard.simpleboard.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@Configuration
public class ThymeleafConfig {


    @Bean
    public SpringResourceTemplateResolver thymeleafTemplateResolver(
            SpringResourceTemplateResolver defaultTemplateResolver,
            Thymeleaf1Properties thymeleaf1Properties
    ) {
        defaultTemplateResolver.setUseDecoupledLogic(true);

        return defaultTemplateResolver;
    }

    @RequiredArgsConstructor
    @Getter
    @ConfigurationProperties("spring.thymeleaf1")
    public static class Thymeleaf1Properties {

        private final boolean decoupledLogic;

    }

}

