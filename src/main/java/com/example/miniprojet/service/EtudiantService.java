package com.example.miniprojet.service;


import com.example.miniprojet.model.Etudiant;
import com.example.miniprojet.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EtudiantService {

    @Autowired
    EtudiantRepository etudiantRepository;

    public Etudiant addEtudiant(Etudiant etudiant){
        return etudiantRepository.save(etudiant);
    }

    public void deleteEtudiant(Long id){
        etudiantRepository.deleteById(id);
    }
    public Etudiant getEtudiant(Long id){
        return etudiantRepository.findById(id).orElse(null);
    }
    public Etudiant updateEtudiant(Long id, Etudiant upEtudiant){
        Optional<Etudiant> optionalEtudiant = etudiantRepository.findById(id);
        if (optionalEtudiant.isPresent()) {
            Etudiant existingEtudiant = optionalEtudiant.get();
            existingEtudiant.setNom(upEtudiant.getNom());
            existingEtudiant.setPrenom(upEtudiant.getPrenom());
            existingEtudiant.setMoyS1(upEtudiant.getMoyS1());
            existingEtudiant.setMoyS2(upEtudiant.getMoyS2());
            existingEtudiant.setMoyS3(upEtudiant.getMoyS3());
            existingEtudiant.setMoyS4(upEtudiant.getMoyS4());
            return etudiantRepository.save(existingEtudiant);
        } else {
            throw new RuntimeException("Etudiant with ID " + id + " not found.");
        }
    }
}
