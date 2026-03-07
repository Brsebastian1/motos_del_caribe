package com.automatization.comunications.model;

import java.time.DayOfWeek;

public record ContractDto(
    String id, 
    String nameClient, 
    String phoneNumber, 
    DayOfWeek payDay, 
    double payment, 
    double balance, 
    String stateWeek) {
} 
