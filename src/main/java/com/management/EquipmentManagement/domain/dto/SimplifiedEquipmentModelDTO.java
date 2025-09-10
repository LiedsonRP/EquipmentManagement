package com.management.EquipmentManagement.domain.dto;

/**
 * DTO with the data of EquipmentModel without physical instances informed
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-10
 *
 * @param id identifier register number in database
 * @param name unique name of equipment model
 * @param category equipment category info
 */
public record SimplifiedEquipmentModelDTO(
        Long id,
        String name,
        SimplifiedCategoryDTO category
) {
}
