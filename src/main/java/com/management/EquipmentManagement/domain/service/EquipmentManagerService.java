package com.management.EquipmentManagement.domain.service;

import com.management.EquipmentManagement.domain.model.EquipmentCategory;
import com.management.EquipmentManagement.domain.model.EquipmentModel;
import com.management.EquipmentManagement.domain.model.PhysicalEquipment;
import com.management.EquipmentManagement.domain.validations.BussinessValidation;
import com.management.EquipmentManagement.domain.validations.CategoryNotExistsValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

        List<BussinessValidation> validations = {}

        try {

        }
    }

}
