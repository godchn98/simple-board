package com.simpleboard.simpleboard.repository;

import com.simpleboard.simpleboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}