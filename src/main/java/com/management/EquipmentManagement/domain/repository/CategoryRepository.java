package com.management.EquipmentManagement.domain.repository;

import com.management.EquipmentManagement.domain.model.EquipmentCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface tha link with Category table on database
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-09
 */
public interface CategoryRepository extends JpaRepository<EquipmentCategory, Long> {
    boolean existsByName(String name);
}
