package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.Writer;

import java.util.List;

public interface WriterService {

    Writer findById(Long id);

    List<Writer> listAll();

    Writer create(String name);
}
