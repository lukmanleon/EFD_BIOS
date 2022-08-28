package com.emilfreydigital.bios.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    TeamDAO teamDAO;

    public List<Team> getAll() {
        return (List<Team>) teamDAO.findAll();
    }

    public Team getTeamById(Long Id) {
        Optional<Team> searchedTeam = teamDAO.findById(Id);
        if (!searchedTeam.isPresent()) {
            throw new EntityNotFoundException();
        }
        return searchedTeam.get();
    }

    public Team getTeamByCode(String teamCode) {
        Optional<Team> searchedTeam = teamDAO.getTeamByCode(teamCode);
        if (!searchedTeam.isPresent()) {
            throw new EntityNotFoundException();
        }
        return searchedTeam.get();
    }

    public Team getTeamByName(String teamName) {
        Optional<Team> searchedTeam = teamDAO.getTeamByName(teamName);
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
            searchedTeam = teamDAO.getTeamByCode(newTeam.getCode());
        }

        if (!searchedTeam.isPresent() && !(newTeam.getName() == null)) {
            searchedTeam = teamDAO.getTeamByName(newTeam.getName());
        }

        if (searchedTeam.isPresent()) {
            throw new DuplicateKeyException("Such a team already exsists.");
        }
        return teamDAO.save(newTeam);
    }

    public Team updateTeam(Long Id, Team team) {
        Team updatedTeam;
        Optional<Team> searchTeam = teamDAO.findById(Id);
        if (searchTeam.isPresent()) {
            Team sample = searchTeam.get();
            sample.setCode(team.getCode());
            sample.setDescription(team.getDescription());
            updatedTeam = teamDAO.save(sample);
        } else {
            throw new EntityNotFoundException();
        }
        return updatedTeam;
    }

    public ResponseEntity<Object> deleteTeam(Long Id) {
        Optional<Team> sampleEntity = teamDAO.findById(Id);
        if (sampleEntity.isPresent()) {
            Team sample = sampleEntity.get();
            teamDAO.delete(sample);
        } else {
            throw new EntityNotFoundException();
        }
        return ResponseEntity.ok().build();
    }
}
