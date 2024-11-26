package com.example.miniprojet.repository;

import com.example.miniprojet.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    @Query("SELECT e from Etudiant e where e.nom=:keyword")
    public List<Etudiant> getEtudiantsByNom(@Param("keyword") String keyword);
}
