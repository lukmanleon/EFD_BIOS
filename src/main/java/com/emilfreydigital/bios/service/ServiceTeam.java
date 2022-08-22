package com.emilfreydigital.bios.service;

import com.emilfreydigital.bios.entity.Team;
import com.emilfreydigital.bios.repository.RepositoryTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceTeam {

    @Autowired
    RepositoryTeam teamRepository;

    public List<Team> getAll() {
        return (List<Team>) teamRepository.findAll();
    }

    public Team getTeamById(Long Id) {
        Optional<Team> searchTeam = teamRepository.findById(Id);
        if (!searchTeam.isPresent()) {
            throw new EntityNotFoundException();
        }
        return searchTeam.get();
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team updateSample(Long Id, Team team) {
        Team updatedTeam;
        Optional<Team> searchTeam = teamRepository.findById(Id);
        if (searchTeam.isPresent()) {
            Team sample = searchTeam.get();
            sample.setCode(team.getCode());
            sample.setDescription(team.getDescription());
            updatedTeam = teamRepository.save(sample);
        } else {
            throw new EntityNotFoundException();
        }
        return updatedTeam;
    }

    public ResponseEntity<Object> deleteSample(Long Id) {
        Optional<Team> sampleEntity = teamRepository.findById(Id);
        if (sampleEntity.isPresent()) {
            Team sample = sampleEntity.get();
            teamRepository.delete(sample);
        } else {
            throw new EntityNotFoundException();
        }
        return ResponseEntity.ok().build();
    }
}
