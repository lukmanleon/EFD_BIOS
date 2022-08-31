package com.emilfreydigital.bios.communication;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "communication", name = "notification")
public class Notification {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "employee_id")
    private Integer EmployeeId;

    @Column(name = "message_title")
    private String MessageTitle;

    @Column(name = "message_text")
    private String MessageText;

    @Column(name = "date_created")
    private LocalDateTime DateCreated;

    @Column(name = "date_modified")
    private LocalDateTime DateModified;

    public Notification() {
    }

    public Notification(Long id, Integer employeeId, String messageTitle, String messageText, LocalDateTime dateCreated, LocalDateTime dateModified) {
        Id = id;
        EmployeeId = employeeId;
        MessageTitle = messageTitle;
        MessageText = messageText;
        DateCreated = dateCreated;
        DateModified = dateModified;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }

    public String getMessageTitle() {
        return MessageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        MessageTitle = messageTitle;
    }

    public String getMessageText() {
        return MessageText;
    }

    public void setMessageText(String messageText) {
        MessageText = messageText;
    }

    public LocalDateTime getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        DateCreated = dateCreated;
    }

    public LocalDateTime getDateModified() {
        return DateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
        DateModified = dateModified;
    }
}
