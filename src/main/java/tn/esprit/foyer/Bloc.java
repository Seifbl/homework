package tn.esprit.foyer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Bloc {
    @Id
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    public Long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public Long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }

    @Override
    public String toString() {
        return "Bloc{" +
                "idBloc=" + idBloc +
                ", nomBloc='" + nomBloc + '\'' +
                ", capaciteBloc=" + capaciteBloc +
                '}';
    }
}
