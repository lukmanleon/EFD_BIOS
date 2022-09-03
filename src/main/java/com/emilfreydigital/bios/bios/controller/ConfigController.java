package com.emilfreydigital.bios.bios.controller;

import com.emilfreydigital.bios.bios.model.Config;
import com.emilfreydigital.bios.bios.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bios/config")
public class ConfigController {

    @Autowired
    ConfigService configService;

    @GetMapping
    public List<Config> rooms() {
        return configService.getAll();
    }
}
