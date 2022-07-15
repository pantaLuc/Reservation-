package com.example.learningSpringboot.business;

import com.example.learningSpringboot.data.Reservation;
import com.example.learningSpringboot.data.Room;
import com.example.learningSpringboot.repository.GuestRepository;
import com.example.learningSpringboot.repository.ReservationRepository;
import com.example.learningSpringboot.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ReservationService {
    private  final RoomRepository roomRepository;
    private  final GuestRepository guestRepository ;
    private final ReservationRepository reservationRepository;

    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }
   /* public List<RoomReservation> getroomreservationbyDate(String Date){
        Iterable<Room> rooms=this.roomRepository.findAll();
        Map<Long , RoomReservation> roomReservationMap=new HashMap<>();
        rooms.forEach(room -> {
            RoomReservation roomReservation=new RoomReservation();
            roomReservation.setRoomId(room.getId());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservationMap.put(room.getId() ,roomReservation);
        });
        Iterable<Reservation> reservations=this.reservationRepository.findReservationByReservationDate(new java.sql.Date(date.getTime()))
    }*/

}
