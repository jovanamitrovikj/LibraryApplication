package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.*;
import mk.ukim.finki.db.library.model.exception.InvalidReservationPlaceIdException;
import mk.ukim.finki.db.library.repository.MemberRepository;
import mk.ukim.finki.db.library.repository.ReservationPlaceRepository;
import mk.ukim.finki.db.library.repository.RoomRepository;
import mk.ukim.finki.db.library.service.ReservationPlaceService;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
public class ReservationPlaceServiceImpl implements ReservationPlaceService {

    private final ReservationPlaceRepository reservationPlaceRepository;
    private final MemberRepository memberRepository;
    private final RoomRepository roomRepository;

    public ReservationPlaceServiceImpl(ReservationPlaceRepository reservationPlaceRepository, MemberRepository memberRepository, RoomRepository roomRepository) {
        this.reservationPlaceRepository = reservationPlaceRepository;
        this.memberRepository = memberRepository;
        this.roomRepository = roomRepository;
    }

    @Override
    public ReservationPlace findById(Long id) {
        return this.reservationPlaceRepository.findById(id).orElseThrow(InvalidReservationPlaceIdException::new);
    }

    @Override
    public List<ReservationPlace> listAll() {
        return this.reservationPlaceRepository.findAll();
    }

    @Override
    public ReservationPlace reservePlace(Long memberId, Long roomId, Date comingDate, Time comingTime, Time leavingTime) {

        Person member = memberId!=null ? this.memberRepository.findById(memberId).orElse((Member) null) : null;
        Room room = roomId!=null ? this.roomRepository.findById(roomId).orElse((Room) null) : null;

        ReservationPlace reservationPlace = new ReservationPlace(comingDate, comingTime, leavingTime);
        //TODO: treba da se zemat site mesta, da se proveri dali ima slobodno i ako ima, od vkupnoto da se namali za edno

        return this.reservationPlaceRepository.save(reservationPlace);
    }
}
