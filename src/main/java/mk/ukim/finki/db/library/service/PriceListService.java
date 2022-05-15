package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.PriceList;

import java.util.List;

public interface PriceListService {

    PriceList findById(Long id);

    List<PriceList> listAll();

    PriceList create(int price);
}
