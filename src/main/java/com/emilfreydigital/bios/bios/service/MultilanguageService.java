package com.emilfreydigital.bios.bios.service;


import com.emilfreydigital.bios.bios.model.Multilanguage;
import com.emilfreydigital.bios.bios.repository.MultilanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultilanguageService {

    private final MultilanguageRepository multilanguageRepository;

    @Autowired
    public MultilanguageService(MultilanguageRepository multilanguageRepository) {
        this.multilanguageRepository = multilanguageRepository;
    }

    public List<Multilanguage> getAll() {
        return (List<Multilanguage>) multilanguageRepository.findAll();
    }

}
