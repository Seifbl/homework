package tn.esprit.foyer.services;


import tn.esprit.foyer.entities.Chambre;

import java.util.List;
import java.util.Set;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);
    public Set<Chambre> getChambresParNomBloc (String nomBloc );
    public long nbrChambreParTypeEtBloc(Chambre.TypeChambre type, long idBloc );


}
