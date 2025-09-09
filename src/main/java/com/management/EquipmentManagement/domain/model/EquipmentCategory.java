package com.management.EquipmentManagement.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 *
 * Represents the category of a group of equipment model in storage
 *
 * @author Liedson dos Reis Pereira
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "equipment_category")
public class EquipmentCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<EquipmentModel> equipmentModelList;
}
