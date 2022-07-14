package com.example.learningSpringboot.repository;

import com.example.learningSpringboot.data.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface ReservationRepository extends JpaRepository<Reservation ,Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
