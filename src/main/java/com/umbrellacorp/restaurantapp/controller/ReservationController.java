package com.umbrellacorp.restaurantapp.controller;

import com.umbrellacorp.restaurantapp.model.Reservation;
import com.umbrellacorp.restaurantapp.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/reservations")
@RestController
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
