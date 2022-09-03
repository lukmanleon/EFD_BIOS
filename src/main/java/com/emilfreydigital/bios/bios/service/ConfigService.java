package com.emilfreydigital.bios.bios.service;


import com.emilfreydigital.bios.bios.repository.ConfigRepository;
import com.emilfreydigital.bios.bios.model.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigService {

    @Autowired
    ConfigRepository configRepository;

    public List<Config> getAll() {
        return (List<Config>) configRepository.findAll();
    }

}
