package com.automatization.comunications.model;


import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Immutable
@Table(name = "vw_sv_all_motos_semanal")
public class Contract {

    @Id
    @Column(name = "contrato")
    private String id;

    @Column(name = "arrendador")
    private String nameClient;

    @Column(name = "TELULT")
    private String phoneNumber;

    @Column(name = "dia_canon")
    private String payDay;
    
    @Column(name = "cuota")
    private double payment;
 
    @Column(name = "saldo")
    private double balance;

    @Column(name = "estado_semana")
    private String stateWeek;


}
