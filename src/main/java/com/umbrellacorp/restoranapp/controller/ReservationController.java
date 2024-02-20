package com.umbrellacorp.restoranapp.controller;

import com.umbrellacorp.restoranapp.model.Reservation;
import com.umbrellacorp.restoranapp.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ReservationController {
    private final ReservationService reservationServices;

    @Autowired
    public ReservationController(ReservationService reservationServices) {
        this.reservationServices = reservationServices;
    }

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationServices.createReservation(reservation);
    }
    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationServices.getAllReservations();
    }

    @GetMapping("/{id}")
    public ReservationService getReservationbyId() {
        return reservationServices;
    }
}
