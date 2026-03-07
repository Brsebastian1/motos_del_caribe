package com.automatization.comunications.service;

import java.util.List;

import com.automatization.comunications.model.ContractDto;
import com.automatization.comunications.model.Notification;

public interface INotificationService {
    public List<ContractDto> findContractNextTopay();
    public List<Notification> findNotifications(String id);
    public void saveNotification(Notification notification);
    public boolean deleteNotification(String id);
}
