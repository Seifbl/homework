package tn.esprit.foyer.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.foyer.services.IBlocService;
@RestController
@AllArgsConstructor



public class BlocController {
    IBlocService blocService;
}
