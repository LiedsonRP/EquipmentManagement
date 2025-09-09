package com.management.EquipmentManagement.domain.model;

import lombok.Getter;

/**
 * Define the available status of physic equipment
 *
 * @author Liedson dos Reis Pereira
 */
@Getter
public enum EquipmentStatus {

    LOCATION("LOCADO"),
    MAINTENANCE("EM MANUTENÇÃO"),
    AVAILABLE("DISPONÍVEL");

    private String desc;

    EquipmentStatus(String desc) {
        this.desc = desc;
    }
}
