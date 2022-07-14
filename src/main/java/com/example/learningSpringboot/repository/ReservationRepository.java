package com.example.learningSpringboot.repository;

import com.example.learningSpringboot.data.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation ,Long> {
}
