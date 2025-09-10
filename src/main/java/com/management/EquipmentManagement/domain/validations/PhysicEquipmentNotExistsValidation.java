package com.management.EquipmentManagement.domain.validations;

import com.management.EquipmentManagement.domain.model.PhysicalEquipment;
import com.management.EquipmentManagement.domain.repository.PhysicEquipmentRepository;
import com.management.EquipmentManagement.infra.Exceptions.PhysicEquipmentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class that validate if equipment physic instance already has inserted in database
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-09
 */
@Component
public class PhysicEquipmentNotExistsValidation implements BusinessValidation<PhysicalEquipment> {

    @Autowired
    PhysicEquipmentRepository equipmentRepository;

    /**
     * Validate if physicalEquipment already exists
     * @param physicEquipment physicalEquipment with full data
     */
    public void validate(PhysicalEquipment physicEquipment) {
        if (equipmentRepository.existsByPropertyCode(physicEquipment.getPropertyCode())) {
            throw new PhysicEquipmentException("O equipamento informado já está cadastrado no sistema");
        }
    }
}
