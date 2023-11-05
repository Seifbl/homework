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
@Table(name = "Universite")
public class Universite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UNIVERSITE_ID")
    private Long idUniversite;
    @Column(name = "UNIVERSITE_NOM")
    private String nomUniversite;
    @Column(name = "UNIVERSITE_adresse")
    private String adresse;

    public Long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "idUniversite=" + idUniversite +
                ", nomUniversite='" + nomUniversite + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
