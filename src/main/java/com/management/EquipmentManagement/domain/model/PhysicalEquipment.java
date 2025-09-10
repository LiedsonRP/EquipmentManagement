package com.management.EquipmentManagement.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Represent a Physic instance of an equipment model
 *
 * @author Liedson dos Reis Pereira
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "physical_equipment")
public class PhysicalEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "property_code", unique = true)
    private String propertyCode;

    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private EquipmentModel model;

    @Enumerated(EnumType.STRING)
    private EquipmentStatus status;

    @Column(name = "last_location_datetime")
    private OffsetDateTime lastLocationDatetime;

    @Column(name = "last_return_datetime")
    private OffsetDateTime lastReturnDateTime;

    @OneToMany(mappedBy = "equipment", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<HistoricRegister> equipmentHistoric;
}
