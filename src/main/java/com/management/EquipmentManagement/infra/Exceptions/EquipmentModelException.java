package com.management.EquipmentManagement.infra.Exceptions;

/**
 * Configure a custom exception to equipment model
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-09
 */
public class EquipmentModelException extends RuntimeException {

    public EquipmentModelException(String msg) {
        super(msg);
    }
}
