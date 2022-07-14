package com.example.learningSpringboot.utils;

import com.example.learningSpringboot.data.Room;
import com.example.learningSpringboot.repository.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;

    public AppStartupEvent(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Iterable<Room> rooms=this.roomRepository.findAll();
        rooms.forEach(room -> System.out.println(room.getName()));

    }
}
