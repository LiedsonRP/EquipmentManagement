package com.management.EquipmentManagement.domain.dto;

import java.util.List;

/**
 *
 * DTO with the data of EquipmentModel with a simplified info of physical instances
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-10
 *
 * @param id identifier register number in database
 * @param name unique name of equipment model
 * @param category equipment category info
 * @param equipmentList list of physic instances of model in storage
 */
public record EquipmentModelDTO(
        Long id,
        String name,
        SimplifiedCategoryDTO category,
        List<SimplifiedPhysicalEquipmentDTO> equipmentList
) {
}
