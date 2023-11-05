package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Chambre {
    public enum TypeChambre {
        SIMPLE, DOUBLE, TRIPLE;
    }

    @Id
    private Long idChambre;
    private Long numeroChambre;

    @Enumerated(EnumType.ORDINAL)
    private TypeChambre typeC;


    public Long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "idChambre=" + idChambre +
                ", numeroChambre=" + numeroChambre +
                ", typeC=" + typeC +
                '}';
    }
}
