package mk.ukim.finki.db.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Writer {

    public Writer(){}

    public Writer(String writerName) {
        this.writerName = writerName;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String writerName;

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        writerName = writerName;
    }
}
