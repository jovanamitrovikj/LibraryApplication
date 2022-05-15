package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.SchoolType;

import java.util.List;

public interface SchoolTypeService {

    SchoolType findById(Long id);

    List<SchoolType> listAll();

    SchoolType create(String name);
}
