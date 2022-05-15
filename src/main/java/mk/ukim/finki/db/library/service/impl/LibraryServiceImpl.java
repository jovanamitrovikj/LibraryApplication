package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.Library;
import mk.ukim.finki.db.library.model.exception.InvalidLibraryIdException;
import mk.ukim.finki.db.library.repository.LibraryRepository;
import mk.ukim.finki.db.library.service.LibraryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryServiceImpl(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public Library findById(Long id) {
        return this.libraryRepository.findById(id).orElseThrow(InvalidLibraryIdException::new);
    }

    @Override
    public Library create(String libraryName, String libraryCity) {
        Library library = new Library(libraryName, libraryCity);
        return this.libraryRepository.save(library);
    }

    @Override
    public Library update(Long id, String libraryName, String libraryCity) {
        Library library = this.findById(id);
        library.setLibraryName(libraryName);
        library.setLibraryCity(libraryCity);
        return this.libraryRepository.save(library);
    }

    @Override
    public Library delete(Long id) {
        Library library = this.findById(id);
        this.libraryRepository.delete(library);
        return library;
    }

    @Override
    public List<Library> listAll(){
        return this.libraryRepository.findAll();
    }

    @Override
    public String getName(){
        return this.listAll().stream().filter(r-> Boolean.parseBoolean(r.getLibraryName())).toString();
    }
}
