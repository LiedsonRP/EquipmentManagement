package com.management.EquipmentManagement.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

/**
 * Represents an register part of equipment historic
 *
 * @author Liedson dos Reis Pereira
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "equipment_historic")
public class HistoricRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "physical_equipment_id")
    private PhysicalEquipment equipment;

    @Enumerated(EnumType.STRING)
    private EquipmentStatus status;
    private OffsetDateTime createdAt;
}
