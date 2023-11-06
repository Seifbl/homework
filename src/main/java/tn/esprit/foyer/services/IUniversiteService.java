package tn.esprit.foyer.services;
import tn.esprit.foyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversities();
    Universite addUniversity (Universite u);
    Universite updateUniversity (Universite u);
    Universite retrieveUniversity (long idUniversity);
    void removeUniversity  (long idUniversity );
    Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite) ;

}
