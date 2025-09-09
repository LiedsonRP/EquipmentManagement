package com.management.EquipmentManagement.infra.Exceptions;

/**
 * Configure a custom exception to equipment model physic instance
 */
public class PhysicEquipmentException extends RuntimeException {

    public PhysicEquipmentException(String msg) {
        super(msg);
    }
}
