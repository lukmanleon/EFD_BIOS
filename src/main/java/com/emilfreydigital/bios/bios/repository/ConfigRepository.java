package com.emilfreydigital.bios.bios.repository;

import com.emilfreydigital.bios.bios.model.Config;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigRepository extends JpaRepository<Config, Long> {
}
