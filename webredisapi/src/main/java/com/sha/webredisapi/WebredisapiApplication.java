package com.sha.webredisapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableAutoConfiguration
@EnableCaching

public class WebredisapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebredisapiApplication.class, args);
    }

}
