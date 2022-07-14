package com.example.learningSpringboot.repository;

import com.example.learningSpringboot.data.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room,Long> {
}
