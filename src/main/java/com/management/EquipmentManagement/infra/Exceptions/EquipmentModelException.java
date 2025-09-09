package com.management.EquipmentManagement.infra.Exceptions;

/**
 * Configure a custom exception to equipment model
 */
public class EquipmentModelException extends RuntimeException {

    public EquipmentModelException(String msg) {
        super(msg);
    }
}
