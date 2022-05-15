package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.Genre;
import mk.ukim.finki.db.library.model.exception.InvalidGenreIdException;
import mk.ukim.finki.db.library.repository.GenreRepository;
import mk.ukim.finki.db.library.service.GenreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public Genre findById(Long id) {
        return this.genreRepository.findById(id).orElseThrow(InvalidGenreIdException::new);
    }

    @Override
    public List<Genre> listAll() {
        return this.genreRepository.findAll();
    }

    @Override
    public Genre create(String name) {
        Genre genre = new Genre(name);
        return this.genreRepository.save(genre);
    }
}
