package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (long idReservation);
    public Reservation getReservationParAnneeUniversitaire(Date date );
}
