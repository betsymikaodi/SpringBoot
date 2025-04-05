package com.monprojet.etudiantcrud.repository;

import com.monprojet.etudiantcrud.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
