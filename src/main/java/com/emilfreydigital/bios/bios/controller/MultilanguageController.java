package com.emilfreydigital.bios.bios.controller;

import com.emilfreydigital.bios.bios.model.Multilanguage;
import com.emilfreydigital.bios.bios.service.MultilanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bios/multilanguage")
public class MultilanguageController {

    @Autowired
    MultilanguageService multilanguageService;

    @GetMapping
    public List<Multilanguage> rooms() {
        return multilanguageService.getAll();
    }
}
