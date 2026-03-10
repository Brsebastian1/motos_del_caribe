package com.automatization.comunications.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.automatization.comunications.model.ContractDto;
import com.automatization.comunications.model.Notification;
import com.automatization.comunications.repository.IRepositoryContract;
import com.automatization.comunications.repository.IRepositoryNotification;

@Service
public class NotificationService implements INotificationService {

    private IRepositoryNotification repositoryNotification;
    private IRepositoryContract repositoryContract;

    public NotificationService(IRepositoryNotification repositoryNotification, IRepositoryContract repositoryContract) {
        this.repositoryNotification = repositoryNotification;
        this.repositoryContract = repositoryContract;
    }

    @Override
    public List<ContractDto> findContractNextTopay() {
        List<ContractDto> contracts = repositoryContract.findAll().stream()
            .map(contract -> new ContractDto(
                contract.getId(),
                contract.getNameClient(),
                contract.getPhoneNumber(),
                contract.getPayDay(),
                contract.getPayment(),
                contract.getBalance(),
                contract.getStateWeek()
            ))
            .toList();
        return contracts;
    }

    @Override
    public List<Notification> findNotifications(String id) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public boolean deleteNotification(String id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void saveNotification(Notification notification) {
        repositoryNotification.save(notification);
    }

}
