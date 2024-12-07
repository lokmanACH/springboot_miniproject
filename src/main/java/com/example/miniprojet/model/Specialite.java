package com.example.miniprojet.model;
import jakarta.persistence.*;

@Entity
public class Specialite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSpec;

    @Column(name = "nom_spec")
    private String nomSpec;

    public String getNomSpec() {
        return nomSpec;
    }

    public void setNomSpec(String nomSpec) {
        this.nomSpec = nomSpec;
    }

    public Integer getNbrPlaces() {
        return nbrPlaces;
    }

    public void setNbrPlaces(Integer nbrPlaces) {
        this.nbrPlaces = nbrPlaces;
    }

    @Column(name = "nbr_places")
    private Integer nbrPlaces;
    public Long getNumSpec() {
        return numSpec;
    }

    public void setNumSpec(Long numSpec) {
        this.numSpec = numSpec;
    }


}
