package com.management.EquipmentManagement.domain.repository;

import com.management.EquipmentManagement.domain.model.EquipmentCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<EquipmentCategory, Long> {
    boolean existsByName(String name);
}
