package tn.esprit.foyer;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Foyer {
    @Id
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

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
