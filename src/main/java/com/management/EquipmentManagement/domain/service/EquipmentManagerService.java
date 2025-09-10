package com.management.EquipmentManagement.domain.service;

import com.management.EquipmentManagement.domain.model.EquipmentCategory;
import com.management.EquipmentManagement.domain.model.EquipmentModel;
import com.management.EquipmentManagement.domain.model.PhysicalEquipment;
import com.management.EquipmentManagement.domain.validations.CategoryNotExistsValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Service class that manages the equipments of system
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-09
 */
@Service
public class EquipmentManagerService {

    @Autowired
    CategoryNotExistsValidation categoryNotExistsValidation;

    /**
     * Insert in database complete information of a new equipment
     * @param category
     * @param model
     * @param equipment
     */
    public void insertNewCompleteEquipment(EquipmentCategory category, EquipmentModel model, PhysicalEquipment equipment) {

    }

    /**
     * Return an equipment catalog based on category
     * @return
     */
    public List<EquipmentModel> getEquipmentCatalog() {

    }

}
