package mk.ukim.finki.db.library.model;

import javax.persistence.*;

@Entity
public class MembershipType {

    public MembershipType(){}

    public MembershipType(String membershipTypeName) {
        this.membershipTypeName = membershipTypeName;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String membershipTypeName;

    @ManyToOne
    private SchoolType schoolType;

    @OneToOne
    private PriceList priceList;

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }

    public String getMembershipTypeName() {
        return membershipTypeName;
    }

    public void setMembershipTypeName(String membershipTypeName) {
        membershipTypeName = membershipTypeName;
    }
}
