package com.management.EquipmentManagement.infra.Exceptions;

/**
 * Configure a custom exception to equipment model physic instance
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-09
 */
public class PhysicEquipmentException extends RuntimeException {

    public PhysicEquipmentException(String msg) {
        super(msg);
    }
}
