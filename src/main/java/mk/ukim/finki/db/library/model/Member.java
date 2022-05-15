package mk.ukim.finki.db.library.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Member extends Person{

    public Member(){

    }

    public Member(Boolean isPayedMembership, Boolean isPayedBook) {
        this.isPayedMembership = isPayedMembership;
        this.isPayedBook = isPayedBook;
    }

    public Member(Boolean isPayedMembership) {
        this.isPayedMembership = isPayedMembership;
    }

    private Boolean isPayedMembership;
    private Boolean isPayedBook;

    @ManyToOne
    private SchoolType schoolType;

    @ManyToOne
    private MembershipType membershipType;

    @ManyToOne
    private Library library;

    public Member(String name, String surname, Date birth, String address, String town, String phoneNumber, String email, String encryptedPasswords) {
        super(name, surname, birth, address, town, phoneNumber, email, encryptedPasswords);
    }

    public Boolean getPayedMembership() {
        return isPayedMembership;
    }

    public void setPayedMembership(Boolean payedMembership) {
        isPayedMembership = payedMembership;
    }

    public Boolean getPayedBook() {
        return isPayedBook;
    }

    public void setPayedBook(Boolean payedBook) {
        isPayedBook = payedBook;
    }

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
