package com.example.miniprojet.service;


import com.example.miniprojet.model.Etudiant;
import com.example.miniprojet.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        Etudiant existingEtudiant = etudiantRepository.findById(id).get();
            if (upEtudiant.getNom() != null){
                existingEtudiant.setNom(upEtudiant.getNom());
            }
            if (upEtudiant.getPrenom() != null){
                existingEtudiant.setPrenom(upEtudiant.getPrenom());
            }
            if(upEtudiant.getMoyS1() != null){
                existingEtudiant.setMoyS1(upEtudiant.getMoyS1());
            }
            if (upEtudiant.getMoyS2() != null){
                existingEtudiant.setMoyS2(upEtudiant.getMoyS2());
            }
            if (upEtudiant.getMoyS3() != null){
                existingEtudiant.setMoyS3(upEtudiant.getMoyS3());
            }
            if (upEtudiant.getMoyS4() != null){
                existingEtudiant.setMoyS4(upEtudiant.getMoyS4());
            }
            return etudiantRepository.save(existingEtudiant);
    }
    public List<Etudiant> getEtudiantsByName(String name){
        return etudiantRepository.getEtudiantsByNom(name);
    }
    public List<Etudiant> getAll(){
        return etudiantRepository.findAll();
    }
    public List<Etudiant> getAllSorted(){
        List<Etudiant> sortedEtudiants = etudiantRepository.findAll().stream()
                .sorted(Comparator.comparingDouble(Etudiant::getMoyGeneral))
                .toList();
        return sortedEtudiants;
    }
}
