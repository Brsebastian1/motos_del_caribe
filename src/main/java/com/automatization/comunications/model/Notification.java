package com.automatization.comunications.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Notification {
    private String idNotification;
    private String numContract;
    private String nameClient;
    private String phoneNumber;
    private LocalDate dayRemember;

}
