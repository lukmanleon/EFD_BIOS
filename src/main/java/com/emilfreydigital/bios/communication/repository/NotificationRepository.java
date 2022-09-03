package com.emilfreydigital.bios.communication.repository;

import com.emilfreydigital.bios.communication.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
