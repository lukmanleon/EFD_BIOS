package com.emilfreydigital.bios.company.repository;

import com.emilfreydigital.bios.company.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Long> {
    @Query("SELECT t FROM Team t WHERE t.Code = ?1")
    Optional<Team> getTeamByCode(String code);

    @Query("SELECT t FROM Team t WHERE t.Name = ?1")
    Optional<Team> getTeamByName(String name);

}
