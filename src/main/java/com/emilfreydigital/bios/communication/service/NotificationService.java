package com.emilfreydigital.bios.communication.service;


import com.emilfreydigital.bios.communication.model.Notification;
import com.emilfreydigital.bios.communication.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    public List<Notification> getAll() {
        return (List<Notification>) notificationRepository.findAll();
    }

}
