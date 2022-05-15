package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.MembershipType;

import java.util.List;

public interface MembershipTypeService {

    MembershipType findById(Long id);

    List<MembershipType> listAll();

    MembershipType create(String name);
}
