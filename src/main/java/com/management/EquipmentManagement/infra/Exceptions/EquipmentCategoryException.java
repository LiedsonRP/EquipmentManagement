package com.management.EquipmentManagement.infra.Exceptions;

/**
 * Configure a custom exception to equipment category
 */
public class EquipmentCategoryException extends RuntimeException {

    public EquipmentCategoryException(String msg) {
        super(msg);
    }
}
