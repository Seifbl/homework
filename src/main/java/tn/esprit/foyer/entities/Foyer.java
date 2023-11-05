package tn.esprit.foyer.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name="Foyer")

public class Foyer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FOYER_ID")
    private Long idFoyer;
    @Column(name = "FOYER_NOM")
    private String nomFoyer;
    @Column(name = "FOYER_CAPACITE")
    private Long capaciteFoyer;

  //  private boolean archived;

    @OneToOne
    private Universite Univ;

    public Foyer(Long idFoyer, String nomFoyer, Long capaciteFoyer) {
        this.idFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;
    }

    public Long getIdFoyer() {
        return idFoyer;
    }

    public void setIdFoyer(Long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public Long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public void setCapaciteFoyer(Long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }

    @Override
    public String toString() {
        return "Foyer{" +
                "idFoyer=" + idFoyer +
                ", nomFoyer='" + nomFoyer + '\'' +
                ", capaciteFoyer=" + capaciteFoyer +
                '}';
    }
}
