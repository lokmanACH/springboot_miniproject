package com.example.miniprojet.repository;

import com.example.miniprojet.model.Choix;
import com.example.miniprojet.model.ChoixPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoixRepository extends JpaRepository<Choix, ChoixPK> {
}
