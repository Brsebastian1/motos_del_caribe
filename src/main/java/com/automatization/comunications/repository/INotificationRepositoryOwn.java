package com.automatization.comunications.repository;

import java.time.DayOfWeek;
import java.util.List;

import com.automatization.comunications.model.ContractDto;
import com.automatization.comunications.model.NotificationDto;

public interface INotificationRepositoryOwn {
    public List<ContractDto> findContractNextToPay(DayOfWeek datDayOfWeek);
    public List<NotificationDto> findNotificationsById(String id);

}
