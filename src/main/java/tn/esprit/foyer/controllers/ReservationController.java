package tn.esprit.foyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Reservation;
import tn.esprit.foyer.services.IReservationService;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationController {
    IReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll() {
        return reservationService.retrieveAllReservation();
    }
    @GetMapping("/{id}")
    public Reservation getBlocById(@PathVariable Long id){
        return reservationService.retrieveReservation(id);
    }


    @PutMapping("/update")
    public Reservation updateBloc( @RequestBody Reservation  res){
        return reservationService.updateReservation(res);
    }
    @GetMapping("/getbydate")
    public Reservation getReservationById(@RequestParam("Date") Date date){
        return  reservationService.getReservationParAnneeUniversitaire(date);
    }
}
