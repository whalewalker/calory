package com.caloryconfigserver.calory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CaloryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaloryApplication.class, args);
    }

}
