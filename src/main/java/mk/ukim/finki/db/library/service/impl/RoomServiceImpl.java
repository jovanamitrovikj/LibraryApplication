package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.Room;
import mk.ukim.finki.db.library.model.exception.InvalidRoomIdException;
import mk.ukim.finki.db.library.repository.RoomRepository;
import mk.ukim.finki.db.library.service.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public Room findById(Long id) {
        return this.roomRepository.findById(id).orElseThrow(InvalidRoomIdException::new);
    }

    @Override
    public List<Room> listAll() {
        return this.roomRepository.findAll();
    }

    @Override
    public Room create(int room) {
        Room roomNum = new Room(room);
        return this.roomRepository.save(roomNum);
    }
}
