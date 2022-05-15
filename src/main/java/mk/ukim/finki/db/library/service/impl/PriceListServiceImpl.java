package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.PriceList;
import mk.ukim.finki.db.library.model.exception.InvalidPriceListIdException;
import mk.ukim.finki.db.library.repository.PriceListRepository;
import mk.ukim.finki.db.library.service.PriceListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceListServiceImpl implements PriceListService {

    private final PriceListRepository priceListRepository;

    public PriceListServiceImpl(PriceListRepository priceListRepository) {
        this.priceListRepository = priceListRepository;
    }

    @Override
    public PriceList findById(Long id) {
        return this.priceListRepository.findById(id).orElseThrow(InvalidPriceListIdException::new);
    }

    @Override
    public List<PriceList> listAll() {
        return this.priceListRepository.findAll();
    }

    @Override
    public PriceList create(int price) {
        PriceList priceList = new PriceList(price);
        return this.priceListRepository.save(priceList);
    }
}
