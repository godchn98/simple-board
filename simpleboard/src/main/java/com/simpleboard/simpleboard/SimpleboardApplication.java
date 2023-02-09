package com.simpleboard.simpleboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SimpleboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleboardApplication.class, args);
    }

}
