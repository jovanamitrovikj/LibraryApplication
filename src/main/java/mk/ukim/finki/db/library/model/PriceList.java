package mk.ukim.finki.db.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PriceList {

    public PriceList(){}

    public PriceList(int price) {
        this.price = price;
    }

    @Id
    @GeneratedValue
    private Long id;

    private int price;
}
