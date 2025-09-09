package com.management.EquipmentManagement.domain.repository;

import com.management.EquipmentManagement.domain.model.EquipmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<EquipmentModel, Long> {
    boolean existsByName(String name);
}
