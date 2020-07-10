package com.sha.jpamysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringSecurityJpaAndMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJpaAndMysqlApplication.class, args);
    }

}
