package mk.ukim.finki.db.library.model;

import javax.persistence.*;

@Entity
public class OnlineDownload {

    public OnlineDownload(){}

    public OnlineDownload(boolean downloaded) {
        this.downloaded = downloaded;
    }

    public OnlineDownload( Member member, Book book, boolean downloaded) {
        this.member = member;
        this.book = book;
        this.downloaded = downloaded;
    }

    @Id
    @GeneratedValue
    private Long id;

    private boolean downloaded;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Book book;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public boolean isDownloaded() {
        return downloaded;
    }

    public void setDownloaded(boolean downloaded) {
        downloaded = downloaded;
    }
}
