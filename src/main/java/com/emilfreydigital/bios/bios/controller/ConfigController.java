package com.emilfreydigital.bios.bios.controller;

import com.emilfreydigital.bios.bios.model.Config;
import com.emilfreydigital.bios.bios.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/config")
public class ConfigController {

    private final ConfigService configService;

    @Autowired
    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }


    @GetMapping
    public List<Config> configs() {
        return configService.getAll();
    }
}
