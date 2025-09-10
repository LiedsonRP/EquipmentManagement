package com.management.EquipmentManagement.domain.dto;

/**
 *
 * DTO with EquipmentCategory info without equipment models associated
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-10
 *
 * @param id identifier register number in database
 * @param name unique name of equipment category
 */
public record SimplifiedCategoryDTO(
        Long id,
        String name
) {
}
