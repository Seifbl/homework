package tn.esprit.foyer.services;

import org.springframework.web.bind.annotation.GetMapping;
import tn.esprit.foyer.entities.Etudiant;

import java.util.List;


public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Long idEtudiant);
    void removeEtudiant(Long idEtudiant);


}
