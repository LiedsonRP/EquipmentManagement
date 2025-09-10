package com.management.EquipmentManagement.domain.validations;

/**
 *
 * Interface that specifies a Business rules format
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-09
 * @param <T> Generics that say to specify class
 */
public interface BusinessValidation<T> {

    void validate(T equipment);
}
