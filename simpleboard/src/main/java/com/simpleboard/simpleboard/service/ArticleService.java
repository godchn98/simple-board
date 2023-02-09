package com.simpleboard.simpleboard.service;

import com.simpleboard.simpleboard.domain.type.SearchType;
import com.simpleboard.simpleboard.dto.ArticleDto;
import com.simpleboard.simpleboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;
    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType title, String search_keyword) {
        return Page.empty();
    }
    @Transactional(readOnly = true)
    public ArticleDto searchArticles(long l) {
        return null;
    }
}
