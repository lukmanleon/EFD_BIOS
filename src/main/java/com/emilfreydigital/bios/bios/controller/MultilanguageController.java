package com.emilfreydigital.bios.bios.controller;

import com.emilfreydigital.bios.bios.dto.MultilanguageDto;
import com.emilfreydigital.bios.bios.service.MultilanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/multilanguage")
public class MultilanguageController {

    private final MultilanguageService multilanguageService;

    @Autowired
    public MultilanguageController(MultilanguageService multilanguageService) {
        this.multilanguageService = multilanguageService;
    }

    @GetMapping
    public List<MultilanguageDto> configs() {
        return multilanguageService.getAll();
    }
}
