package com.jean.configserverlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverlocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigserverlocalApplication.class, args);
    }

}
