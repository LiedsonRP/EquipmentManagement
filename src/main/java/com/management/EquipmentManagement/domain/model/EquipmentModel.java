package com.management.EquipmentManagement.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 *
 * Represents the equipment model in storage
 *
 * @author Liedson dos Reis Pereira
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "equipment_model")
public class EquipmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private EquipmentCategory category;

    @OneToMany(mappedBy = "model", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<PhysicalEquipment> equipmentList;
}
