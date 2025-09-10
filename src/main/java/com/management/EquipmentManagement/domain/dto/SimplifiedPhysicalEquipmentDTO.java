package com.management.EquipmentManagement.domain.dto;

import java.time.OffsetDateTime;

/**
 * DTO with the data of PhysicalEquipment without Historic
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-10
 *
 * @param id identifier register number in database
 * @param propertyCode unique equipment code
 * @param model Simplified model info
 * @param lastLocationDatetime Date and Time of last location of equipment
 * @param lastReturnDateTime Date and Time of last return of location
 */
public record SimplifiedPhysicalEquipmentDTO(
        Long id,
        String propertyCode,
        SimplifiedEquipmentModelDTO model,
        OffsetDateTime lastLocationDatetime,
        OffsetDateTime lastReturnDateTime
) {
}
