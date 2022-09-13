package com.emilfreydigital.bios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class BiosApplication {
    Logger logger = LoggerFactory.getLogger(BiosApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BiosApplication.class, args);
    }

    @GetMapping()
    public List<String> hello() {
        logger.info("Hello method access.");
        return List.of("This is the prototype for the Emil Frey Digital, Basic Information Overview System or BIOS application.");
    }

}
