package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.dto.TeamDto;
import com.emilfreydigital.bios.company.model.Team;
import com.emilfreydigital.bios.company.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/bios/teams")
public class TeamController {
    private Logger logger = LoggerFactory.getLogger(TeamController.class);
    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<TeamDto> team() {
        logger.info("TEAM: Received request for fetching all teams.");
        return teamService.getAll();
    }

    @GetMapping(value = "/{id}")
    public TeamDto getTeamById(@PathVariable(value = "id") Long id) {
        logger.info("TEAM: Received request for fetching a team by ID.");
        return teamService.getTeamById(id);
    }

    @GetMapping(value = "/code/{code}")
    public Team getTeamByCode(@PathVariable(value = "code") String teamCode) {
        logger.info("TEAM: Received request for fetching teams by code.");
        return teamService.getTeamByCode(teamCode);
    }

    @GetMapping(value = "/name/{name}")
    public Team getTeamByName(@PathVariable(value = "name") String teamName) {
        logger.info("TEAM: Received request for fetching teams by name.");
        return teamService.getTeamByName(teamName);
    }

    @PostMapping(value = "/create")
    public Team createTeam(@Valid @RequestBody Team teamEntity) {
        logger.info("TEAM: Received request for fetching creating a new team.");
        return teamService.createTeam(teamEntity);
    }

    @PutMapping(value = "/update/{id}")
    public Team updateSample(@PathVariable(value = "id") Long id,
                             @Valid @RequestBody Team sampleEntity) {
        logger.info("TEAM: Received request for updating a team with ID: " + id.toString() + ".");
        return teamService.updateTeam(id, sampleEntity);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Object> deleteTeam(@PathVariable(value = "id") Long id) {
        logger.info("TEAM: Received request to delete the team with ID: " + id.toString() + ".");
        return teamService.deleteTeam(id);
    }

}
