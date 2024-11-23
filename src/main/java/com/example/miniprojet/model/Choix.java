package com.example.miniprojet.model;
import jakarta.persistence.*;

@Entity
@IdClass(ChoixPK.class)
public class Choix {

    @Id
    @Column(name = "num_e")
    private Long numE;

    @Id
    private Long numSpec;

    private Integer ordreChoix;
    public Long getNumE() {
        return numE;
    }

    public void setNumE(Long numE) {
        this.numE = numE;
    }

    public Long getNumSpec() {
        return numSpec;
    }

    public void setNumSpec(Long numSpec) {
        this.numSpec = numSpec;
    }

    public Integer getOrdreChoix() {
        return ordreChoix;
    }

    public void setOrdreChoix(Integer ordreChoix) {
        this.ordreChoix = ordreChoix;
    }
    @ManyToOne
    @JoinColumn(name = "num_e", insertable = false, updatable = false) // Foreign key
    private Etudiant etudiant;
}
