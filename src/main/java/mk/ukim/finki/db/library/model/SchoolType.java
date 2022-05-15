package mk.ukim.finki.db.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SchoolType {

    public SchoolType(){}

    public SchoolType(String schoolTypeName) {
        this.schoolTypeName = schoolTypeName;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String schoolTypeName;


}
