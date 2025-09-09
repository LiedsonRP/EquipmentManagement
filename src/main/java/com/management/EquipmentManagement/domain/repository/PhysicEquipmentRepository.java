package com.management.EquipmentManagement.domain.repository;

import com.management.EquipmentManagement.domain.model.PhysicalEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicEquipmentRepository extends JpaRepository<PhysicalEquipment, Long> {
    boolean existsByPropertyCode(String propertyCode);
}
