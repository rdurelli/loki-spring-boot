package com.example.demolog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemologApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(DemologApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemologApplication.class, args);
        LOGGER.info("This is information");
        LOGGER.debug("This is debug");
        LOGGER.error("This is error");
    }

}
