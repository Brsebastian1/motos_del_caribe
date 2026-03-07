package com.automatization.comunications.model;

import java.time.DayOfWeek;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vw_sw_all_motos_semanal")
public class Contract {

    @Id
    private String id;

    private String nameClient;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private DayOfWeek payDay;

    private double payment;

    private double balance;

    private String stateWeek;


}
