package com.simpleboard.simpleboard.service;

import com.simpleboard.simpleboard.domain.type.SearchType;
import com.simpleboard.simpleboard.dto.ArticleDto;
import com.simpleboard.simpleboard.dto.ArticleWithCommentDto;
import com.simpleboard.simpleboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;
    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable) {
        return Page.empty();
    }
    @Transactional(readOnly = true)
    public ArticleWithCommentDto getArticle(Long articleId) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {
    }

    public void updateArticle(ArticleDto dto) {
    }

    public void deleteArticle(long articleId) {
    }

}