package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.SchoolType;
import mk.ukim.finki.db.library.model.exception.InvalidSchoolTypeIdException;
import mk.ukim.finki.db.library.repository.SchoolTypeRepository;
import mk.ukim.finki.db.library.service.SchoolTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolTypeServiceImpl implements SchoolTypeService {

    private final SchoolTypeRepository schoolTypeRepository;

    public SchoolTypeServiceImpl(SchoolTypeRepository schoolTypeRepository) {
        this.schoolTypeRepository = schoolTypeRepository;
    }

    @Override
    public SchoolType findById(Long id) {
        return this.schoolTypeRepository.findById(id).orElseThrow(InvalidSchoolTypeIdException::new);
    }

    @Override
    public List<SchoolType> listAll() {
        return this.schoolTypeRepository.findAll();
    }

    @Override
    public SchoolType create(String name) {
        SchoolType schoolType = new SchoolType(name);
        return this.schoolTypeRepository.save(schoolType);
    }
}
