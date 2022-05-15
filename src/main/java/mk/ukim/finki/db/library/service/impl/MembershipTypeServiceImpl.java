package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.MembershipType;
import mk.ukim.finki.db.library.model.exception.InvalidMembershipTypeIdException;
import mk.ukim.finki.db.library.repository.MembershipTypeRepository;
import mk.ukim.finki.db.library.service.MembershipTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipTypeServiceImpl implements MembershipTypeService {

    private final MembershipTypeRepository membershipTypeRepository;

    public MembershipTypeServiceImpl(MembershipTypeRepository membershipTypeRepository) {
        this.membershipTypeRepository = membershipTypeRepository;
    }


    @Override
    public MembershipType findById(Long id) {
        return this.membershipTypeRepository.findById(id).orElseThrow(InvalidMembershipTypeIdException::new);
    }

    @Override
    public List<MembershipType> listAll() {
        return this.membershipTypeRepository.findAll();
    }

    @Override
    public MembershipType create(String name) {
        MembershipType membershipType = new MembershipType(name);
        return this.membershipTypeRepository.save(membershipType);
    }
}
