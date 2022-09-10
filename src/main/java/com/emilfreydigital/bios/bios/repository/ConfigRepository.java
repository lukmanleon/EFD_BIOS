package com.emilfreydigital.bios.bios.repository;

import com.emilfreydigital.bios.bios.model.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends JpaRepository<Config, Long> {
}
