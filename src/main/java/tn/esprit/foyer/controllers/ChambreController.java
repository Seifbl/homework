package tn.esprit.foyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.foyer.services.IChambreService;

@RestController
@AllArgsConstructor
public class ChambreController {

    IChambreService chambreService;
}
