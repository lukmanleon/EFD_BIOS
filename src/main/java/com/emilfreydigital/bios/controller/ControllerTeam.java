package com.emilfreydigital.bios.controller;

import com.emilfreydigital.bios.entity.Team;
import com.emilfreydigital.bios.service.ServiceTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ControllerTeam {

    @Autowired
    ServiceTeam teamService;

    @RequestMapping(value = "/teams")
    public List<Team> team() {
        return teamService.getAll();
    }

    @RequestMapping(value = "/team/{id}", method = RequestMethod.GET)
    public Team getTeamById(@PathVariable(value = "id") Long id) {
        return teamService.getTeamById(id);
    }

    @RequestMapping(value = "/createteam", method = RequestMethod.POST)
    public Team createSample(@Valid @RequestBody Team sampleEntity) {
        return teamService.createTeam(sampleEntity);
    }

    @RequestMapping(value = "/deleteteam/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteSample(@PathVariable(value = "id") Long id) {
        return teamService.deleteSample(id);
    }

    @RequestMapping(value = "/updateteam/{id}", method = RequestMethod.PUT)
    public Team updateSample(@PathVariable(value = "id") Long id,
                             @Valid @RequestBody Team sampleEntity) {
        return teamService.updateSample(id, sampleEntity);
    }
}
