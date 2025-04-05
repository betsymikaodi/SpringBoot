package com.monprojet.etudiantcrud.service;

import com.monprojet.etudiantcrud.model.Etudiant;
import com.monprojet.etudiantcrud.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public Etudiant getEtudiantById(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public Etudiant updateEtudiant(Long id, Etudiant etudiantDetails) {
        Etudiant etudiant = getEtudiantById(id);
        if (etudiant != null) {
            etudiant.setNumET(etudiantDetails.getNumET());
            etudiant.setNom(etudiantDetails.getNom());
            etudiant.setNote_math(etudiantDetails.getNote_math());
            etudiant.setNote_phys(etudiantDetails.getNote_phys());
            return etudiantRepository.save(etudiant);
        }
        return null;
    }

    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }
}
