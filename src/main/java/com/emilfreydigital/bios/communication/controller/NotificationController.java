package com.emilfreydigital.bios.communication.controller;

import com.emilfreydigital.bios.communication.model.Notification;
import com.emilfreydigital.bios.communication.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bios/notifications")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @GetMapping
    public List<Notification> rooms() {
        return notificationService.getAll();
    }
}
