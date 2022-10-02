package com.emilfreydigital.bios.bios.controller;

import com.emilfreydigital.bios.bios.dto.ConfigDto;
import com.emilfreydigital.bios.bios.service.ConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/config")
public class ConfigController {

    Logger logger = LoggerFactory.getLogger(ConfigController.class);
    private final ConfigService configService;

    @Autowired
    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping
    public List<ConfigDto> configs() {
        logger.info("CONFIG: Received request for fetching app configuration.");
        return configService.getAll();
    }
}
