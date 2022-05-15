package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.Genre;

import java.util.List;

public interface GenreService {

    Genre findById(Long id);

    List<Genre> listAll();

    Genre create(String name);
}
