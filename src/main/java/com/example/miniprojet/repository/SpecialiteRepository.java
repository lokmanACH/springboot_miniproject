package com.example.miniprojet.repository;

import com.example.miniprojet.model.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite,Long> {
    @Query("SELECT s FROM Specialite s WHERE " +
            "(CAST(:searchTerm AS integer) IS NOT NULL AND s.nbrPlaces = :searchTerm) OR " +
            "(LOWER(s.nomSpec) LIKE LOWER(CONCAT('%', :searchTerm, '%')))")
    public List<Specialite> searchSpecialite(@Param("searchTerm") String searchTerm);
}
