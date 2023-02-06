package com.simpleboard.simpleboard.repository;

import com.simpleboard.simpleboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}