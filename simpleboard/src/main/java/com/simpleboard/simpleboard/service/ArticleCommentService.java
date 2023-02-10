package com.simpleboard.simpleboard.service;

import com.simpleboard.simpleboard.dto.ArticleCommentDto;
import com.simpleboard.simpleboard.repository.ArticleCommentRepository;
import com.simpleboard.simpleboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComment(long articleID) {
        return List.of();
    }

    public void saveArticleComment(ArticleCommentDto dto){ }
    public void updateArticleComment(ArticleCommentDto dto) { }
    public void deleteArticleComment(Long articleCommentId) { }

    }
