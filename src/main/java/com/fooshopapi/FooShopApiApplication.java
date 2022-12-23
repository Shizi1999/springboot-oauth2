package com.fooshopapi;

import com.fooshopapi.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class FooShopApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FooShopApiApplication.class, args);
    }

}
