package com.emilfreydigital.bios.service;

import com.emilfreydigital.bios.entity.Team;
import com.emilfreydigital.bios.repository.RepositoryTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTeam {

    @Autowired
    RepositoryTeam teamRepository;

    public List<Team> getAllTeams() {
        return teamRepository.getAllTeams();
    }
}
