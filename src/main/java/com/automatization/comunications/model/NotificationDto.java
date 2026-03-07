package com.automatization.comunications.model;

import java.time.LocalDate;

public record NotificationDto(
    String idNotification,
    String numContract,
    String nameClient,
    String phoneNumber,
    LocalDate dayRemember) {}
