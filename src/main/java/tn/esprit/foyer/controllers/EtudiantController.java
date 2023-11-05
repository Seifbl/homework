package tn.esprit.foyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Etudiant;
import tn.esprit.foyer.services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("etudiants")
public class EtudiantController {
    IEtudiantService etudiantService;
    @GetMapping("/GetAllEtudiants")
    public List<Etudiant> getAllEtudiants(){
        return etudiantService.retrieveAllEtudiants();
    }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }


    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e){
        Etudiant etudiant= etudiantService.updateEtudiant(e);
        return etudiant;
    }
//http://localhost:8083/tpfoyer17/etudiants/remove-etudiant/1
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId){
        etudiantService.removeEtudiant(etudiantId);
    }

}
