package tn.esprit.foyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Etudiant;
import tn.esprit.foyer.entities.Foyer;
import tn.esprit.foyer.services.IEtudiantService;
import tn.esprit.foyer.services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor


    @RequestMapping("foyers")
    public class FoyerController {
        IFoyerService foyerService;
        @GetMapping("/GetAllFoyers")
        public List<Foyer> getAllFoyers(){
            return foyerService.retrieveAllFoyer();
        }

        @PostMapping("/add-foyer")
        public Foyer addFoyer(@RequestBody Foyer f) {
            Foyer foyer = foyerService.addFoyer(f);
            return foyer;
        }

    @PutMapping("/update-foyer")
    public Foyer updateEtudiant(@RequestBody Foyer f){
        Foyer foyer= foyerService.updateFoyer(f);
        return foyer;
    }

    }
