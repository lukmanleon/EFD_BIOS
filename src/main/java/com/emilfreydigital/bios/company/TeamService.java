package com.emilfreydigital.bios.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public List<Team> getAll() {
        return (List<Team>) teamRepository.findAll();
    }

    public Team getTeamById(Long Id) {
        Optional<Team> searchedTeam = teamRepository.findById(Id);
        if (!searchedTeam.isPresent()) {
            throw new EntityNotFoundException();
        }
        return searchedTeam.get();
    }

    public Team getTeamByCode(String teamCode) {
        Optional<Team> searchedTeam = teamRepository.getTeamByCode(teamCode);
        if (!searchedTeam.isPresent()) {
            throw new EntityNotFoundException();
        }
        return searchedTeam.get();
    }

    public Team getTeamByName(String teamName) {
        Optional<Team> searchedTeam = teamRepository.getTeamByName(teamName);
        if (!searchedTeam.isPresent()) {
            throw new EntityNotFoundException();
        }
        return searchedTeam.get();
    }

    public Team createTeam(Team newTeam) {

        if (newTeam.getCode() == null && newTeam.getName() == null) {
            throw new Error("New team needs to have code and name values.");
        }

        Optional<Team> searchedTeam = null;
        if (!(newTeam.getCode() == null)) {
            searchedTeam = teamRepository.getTeamByCode(newTeam.getCode());
        }

        if (!searchedTeam.isPresent() && !(newTeam.getName() == null)) {
            searchedTeam = teamRepository.getTeamByName(newTeam.getName());
        }

        if (searchedTeam.isPresent()) {
            throw new DuplicateKeyException("Such a team already exists.");
        }
        return teamRepository.save(newTeam);
    }

    public Team updateTeam(Long Id, Team team) {
        Team updatedTeam;
        Optional<Team> searchTeam = teamRepository.findById(Id);
        if (searchTeam.isPresent()) {
            Team sample = searchTeam.get();
            sample.setCode(team.getCode());
            sample.setName(team.getName());
            sample.setDescription(team.getDescription());
            sample.setDateModified(LocalDateTime.now());
            updatedTeam = teamRepository.save(sample);
        } else {
            throw new EntityNotFoundException();
        }
        return updatedTeam;
    }

    public ResponseEntity<Object> deleteTeam(Long Id) {
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
