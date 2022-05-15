package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.OnlineDownload;

import java.util.List;

public interface OnlineDownloadService {

    OnlineDownload findById(Long id);

    List<OnlineDownload> listAll();

    OnlineDownload reserveBook(Long memberId, Long bookId, boolean isDownloadedBook);
}
