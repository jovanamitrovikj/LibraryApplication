package mk.ukim.finki.db.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.util.Date;

@Entity
public class ReservationPlace {

    public ReservationPlace(int resPlace){}

    public ReservationPlace(Date comingDate, Time comingTime, Time leavingTime) {
        this.comingDate = comingDate;
        this.comingTime = comingTime;
        this.leavingTime = leavingTime;
    }

    @Id
    @GeneratedValue
    private Long id;

    private Date comingDate;

    private Time comingTime;

    private Time leavingTime;

    @ManyToOne
    private Room room;

    @ManyToOne
    private Member member;

    public ReservationPlace() {

    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getComingDate() {
        return comingDate;
    }

    public void setComingDate(Date comingDate) {
        comingDate = comingDate;
    }

    public Time getComingTime() {
        return comingTime;
    }

    public void setComingTime(Time comingTime) {
        comingTime = comingTime;
    }

    public Time getLeavingTime() {
        return leavingTime;
    }

    public void setLeavingTime(Time leavingTime) {
        leavingTime = leavingTime;
    }
}
