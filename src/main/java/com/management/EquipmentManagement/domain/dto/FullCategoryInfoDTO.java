package com.management.EquipmentManagement.domain.dto;

import java.util.List;

/**
 * DTO with full data of EquipmentCategory
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-10
 *
 * @param id identifier register number in database
 * @param name unique name of equipment category
 * @param equipmentsInCategory List of all equipments model associated a category
 */
public record FullCategoryInfoDTO(
        Long id,
        String name,
        List<EquipmentModelDTO> equipmentsInCategory
) {
}
