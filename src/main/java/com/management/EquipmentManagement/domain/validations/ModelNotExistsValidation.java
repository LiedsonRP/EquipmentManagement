package com.management.EquipmentManagement.domain.validations;

import com.management.EquipmentManagement.domain.model.EquipmentModel;
import com.management.EquipmentManagement.domain.repository.ModelRepository;
import com.management.EquipmentManagement.infra.Exceptions.EquipmentModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class that validate if a determined model already has inserted in database
 *
 * @author Liedson dos Reis Pereira
 * @version 0.0.1-SNAPSHOT
 * @since 2025-09-09
 */
@Component
public class ModelNotExistsValidation implements BusinessValidation<EquipmentModel> {

    @Autowired
    ModelRepository modelRepository;

    /**
     * Validate if model already exists
     * @param model model with full data
     */
    public void validate(EquipmentModel model) {
        if (modelRepository.existsByName(model.getName())) {
            throw new EquipmentModelException("O modelo de equipamento informado já está cadastrado no sistema");
        }
    }
}
