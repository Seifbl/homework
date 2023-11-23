package tn.esprit.foyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Chambre;
import tn.esprit.foyer.services.IChambreService;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
public class ChambreController {

    IChambreService chambreService;


    @GetMapping("/all")
    public List<Chambre> getAll() {
        return chambreService.retrieveAllChambres();
    }
    @GetMapping("/{id}")
    public Chambre getBlocById(@PathVariable Long id){
        return chambreService.retrieveChambre(id);
    }

    @PostMapping("/add")
    public Chambre addBloc(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }
    @PutMapping("/update")
    public Chambre updateBloc( @RequestBody Chambre  c){
        return chambreService.updateChambre(c);
    }

    @GetMapping("/getChambresParNomBloc ")
    public Set<Chambre> getChambresParNomBloc(@RequestParam("nomBloc") String  nomBloc){
        return  chambreService.getChambresParNomBloc(nomBloc);
    }
    @GetMapping("/getChambresParBlocEtType")
    public long getChambresParBlocEtType(@RequestParam("id") Long id, @RequestParam("type") Chambre.TypeChambre type ){
        long blocs = chambreService.nbrChambreParTypeEtBloc(type,id);
        return blocs;
    }
}
