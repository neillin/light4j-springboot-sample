package com.example.restservice;

import com.networknt.springboot.Light4jSpringBoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {

//        SpringApplication.run(RestServiceApplication.class, args);
        Light4jSpringBoot.bootstrap(RestServiceApplication.class, args);
    }

}
