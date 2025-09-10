package com.management.EquipmentManagement.domain.repository;

import com.management.EquipmentManagement.domain.model.PhysicalEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface tha link with physic equipment table on database
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-09
 */
public interface PhysicEquipmentRepository extends JpaRepository<PhysicalEquipment, Long> {
    boolean existsByPropertyCode(String propertyCode);
}
