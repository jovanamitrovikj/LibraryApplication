package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.ReservationPlace;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface ReservationPlaceService {

    ReservationPlace findById(Long id);

    List<ReservationPlace> listAll();

    ReservationPlace reservePlace(Long memberId, Long roomId, Date comingDate, Time comingTime, Time leavingTime);
}
