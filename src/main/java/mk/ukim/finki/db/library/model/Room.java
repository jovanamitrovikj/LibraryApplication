package mk.ukim.finki.db.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Room {

    public Room(){}

    public Room(int places, int freePlaces) {
        this.places = places;
        this.freePlaces = freePlaces;
    }

    public Room(int places) {
        this.places = places;
    }

    @Id
    @GeneratedValue
    private Long id;

    private int places;

    private int freePlaces;

    @ManyToOne
    private Library library;

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        places = places;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }
}
