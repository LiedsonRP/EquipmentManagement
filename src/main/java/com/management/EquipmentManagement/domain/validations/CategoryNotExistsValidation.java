package com.management.EquipmentManagement.domain.validations;

import com.management.EquipmentManagement.domain.model.EquipmentCategory;
import com.management.EquipmentManagement.domain.repository.CategoryRepository;
import com.management.EquipmentManagement.infra.Exceptions.EquipmentCategoryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class that validate if a determined category already has inserted in database
 */
@Component
public class CategoryNotExistsValidation implements BussinessValidation<EquipmentCategory> {

    @Autowired
    CategoryRepository categoryRepository;

    /**
     * Validate category already exists
     * @param category category with full data
     */
    public void validate(EquipmentCategory category) {
        if (categoryRepository.existsByName(category.getName())) {
            throw new EquipmentCategoryException("A categoria informada já está cadastrada no sistema");
        }
    }
}
