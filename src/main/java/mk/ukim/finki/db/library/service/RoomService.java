package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.Room;

import java.util.List;

public interface RoomService {

    Room findById(Long id);

    List<Room> listAll();

    Room create(int name);
}
