package com.monprojet.etudiantcrud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "etudiant",
        uniqueConstraints = @UniqueConstraint(columnNames = "numET")
)
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String numET;

    private String nom;
    private double note_math;
    private double note_phys;
}
