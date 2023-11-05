package tn.esprit.foyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.services.IReservationService;

@Service
@AllArgsConstructor
public class ReservationController {
    IReservationService reservationService;
}
