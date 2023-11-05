package tn.esprit.foyer.controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Universite;
import tn.esprit.foyer.services.IReservationService;
import tn.esprit.foyer.services.IUniversiteService;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService universiteService;
    @GetMapping("/all")
    @JsonIgnore
    public List<Universite> getAll() {
        return universiteService.retrieveAllUniversities();
    }
    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable Long id){
        return universiteService.retrieveUniversity(id);
    }

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite e) {
        return universiteService.addUniversity(e);
    }
    @PutMapping("/update")
    public Universite updateUniversite( @RequestBody Universite  Universite){
        return universiteService.updateUniversity(Universite);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUniversite(@PathVariable Long id){
        universiteService.removeUniversity(id);

    }

}
