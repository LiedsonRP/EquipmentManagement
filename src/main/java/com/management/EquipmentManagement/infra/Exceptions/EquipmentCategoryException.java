package com.management.EquipmentManagement.infra.Exceptions;

/**
 * Configure a custom exception to equipment category
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-09
 */
public class EquipmentCategoryException extends RuntimeException {

    public EquipmentCategoryException(String msg) {
        super(msg);
    }
}
