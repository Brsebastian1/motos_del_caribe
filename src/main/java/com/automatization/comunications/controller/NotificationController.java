package com.automatization.comunications.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.automatization.comunications.model.Notification;
import com.automatization.comunications.service.INotificationService;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@Tag(name = "NotificationController", description = "Controller for managing notifications")
public class NotificationController {
    
    private INotificationService notificationService;

    public NotificationController(INotificationService notificationService) {
        this.notificationService = notificationService;
    }


    @PostMapping("save")
    public ResponseEntity<Notification> save(@RequestBody Notification notification) {
        try{
            notificationService.saveNotification(notification);
            return ResponseEntity.ok(notification);
        }
        catch(Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    
    }
    

}
