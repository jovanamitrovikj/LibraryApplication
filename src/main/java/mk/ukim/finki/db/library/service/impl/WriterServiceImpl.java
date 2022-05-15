package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.Person;
import mk.ukim.finki.db.library.model.Writer;
import mk.ukim.finki.db.library.model.exception.InvalidWriterIdException;
import mk.ukim.finki.db.library.repository.WriterRepository;
import mk.ukim.finki.db.library.service.WriterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WriterServiceImpl implements WriterService {

    private final WriterRepository writerRepository;

    public WriterServiceImpl(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }

    @Override
    public Writer findById(Long id) {
        return this.writerRepository.findById(id).orElseThrow(InvalidWriterIdException::new);
    }

    @Override
    public List<Writer> listAll() {
        return this.writerRepository.findAll();
    }

    @Override
    public Writer create(String name) {
        Writer writer = new Writer(name);
        return this.writerRepository.save(writer);
    }
}
