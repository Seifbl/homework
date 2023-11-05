package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Etudiant;
import tn.esprit.foyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {

    List<Foyer> retrieveAllFoyer();
    Foyer addFoyer(Foyer f);
    Foyer updateFoyer(Foyer f);
    Foyer retrieveFoyer(Long idFoyer);

   // void archiverFoyer (Long idFoyer);

}
