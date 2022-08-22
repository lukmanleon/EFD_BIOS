package com.emilfreydigital.bios.repository;

import com.emilfreydigital.bios.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositoryTeam extends JpaRepository<Team, Long> {
    @Query("FROM Team")
    public List<Team> getAllTeams();
}
