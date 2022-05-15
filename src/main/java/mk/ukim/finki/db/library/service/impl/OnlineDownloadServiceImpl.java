package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.*;
import mk.ukim.finki.db.library.model.exception.InvalidOnlineDownloadIdException;
import mk.ukim.finki.db.library.repository.BookRepository;
import mk.ukim.finki.db.library.repository.MemberRepository;
import mk.ukim.finki.db.library.repository.OnlineDownloadRepository;
import mk.ukim.finki.db.library.service.OnlineDownloadService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineDownloadServiceImpl implements OnlineDownloadService {

    private final OnlineDownloadRepository onlineDownloadRepository;
    private final MemberRepository memberRepository;
    private final BookRepository bookRepository;

    public OnlineDownloadServiceImpl(OnlineDownloadRepository onlineDownloadRepository, MemberRepository memberRepository, BookRepository bookRepository) {
        this.onlineDownloadRepository = onlineDownloadRepository;
        this.memberRepository = memberRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public OnlineDownload findById(Long id) {
        return this.onlineDownloadRepository.findById(id).orElseThrow(InvalidOnlineDownloadIdException::new);
    }

    @Override
    public List<OnlineDownload> listAll() {
        return this.onlineDownloadRepository.findAll();
    }

    @Override
    public OnlineDownload reserveBook(Long memberId, Long bookId, boolean isDownloadedBook) {
        Person member = memberId!=null ? this.memberRepository.findById(memberId).orElse((Member) null) : null;
        Book book = bookId!=null ? this.bookRepository.findById(bookId).orElse((Book) null) : null;

        OnlineDownload onlineDownload = new OnlineDownload((Member) member, book, isDownloadedBook);

        return this.onlineDownloadRepository.save(onlineDownload);
    }
}
