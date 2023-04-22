package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.Library;

import java.util.List;

public interface LibraryService {

    Library findById(Long id);

    //List<Library> listAll();

    Library create(String libraryName, String libraryCity);

    Library update(Long id, String libraryName, String libraryCity);

    Library delete(Long id);

    //String getName();
}
