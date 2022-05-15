package mk.ukim.finki.db.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genre {

    public Genre(){}

    public Genre(String genreName) {
        this.genreName = genreName;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String genreName;

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        genreName = genreName;
    }
}
