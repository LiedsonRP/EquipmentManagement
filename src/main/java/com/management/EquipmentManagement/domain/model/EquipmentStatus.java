package com.management.EquipmentManagement.domain.model;

import lombok.Getter;

/**
 * Define the available status of physic equipment
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-09
 */
@Getter
public enum EquipmentStatus {

    LOCATED("LOCADO"),
    MAINTENANCE("EM MANUTENÇÃO"),
    AVAILABLE("DISPONÍVEL");

    private String desc;

    EquipmentStatus(String desc) {
        this.desc = desc;
    }
}
