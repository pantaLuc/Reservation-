package com.example.learningSpringboot.utils;

import com.example.learningSpringboot.data.Reservation;
import com.example.learningSpringboot.data.Room;
import com.example.learningSpringboot.repository.ReservationRepository;
import com.example.learningSpringboot.repository.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;
    private final ReservationRepository reservationRepository;
    private final DateUtils dateUtils;
    public AppStartupEvent(RoomRepository roomRepository, ReservationRepository reservationRepository, DateUtils dateUtils) {
        this.roomRepository = roomRepository;
        this.reservationRepository = reservationRepository;
        this.dateUtils = dateUtils;
    }
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Date date = null;
        try {
            date = this.dateUtils.createDateFromString("2022-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // Iterable<Room> rooms=this.roomRepository.findAll();
        //rooms.forEach(room -> System.out.println(room.getName()));
        Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(date);
        reservations.forEach(reservation -> System.out.println(reservation.getReservationDate()));

    }
}
