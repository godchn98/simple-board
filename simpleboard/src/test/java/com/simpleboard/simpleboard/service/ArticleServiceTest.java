package com.simpleboard.simpleboard.service;

import com.simpleboard.simpleboard.domain.type.SearchType;
import com.simpleboard.simpleboard.dto.ArticleDto;
import com.simpleboard.simpleboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("service logic - board")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks private ArticleService sut;

    @Mock private ArticleRepository articleRepository;

    @DisplayName("search article, return article list")
    @Test
    void givenSearchParameters_whenSearchArticles_thenReturnArticleList() {


        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword");

        assertThat(articles).isNotNull();
    }

    @DisplayName("input article id, return article")
    @Test
    void givenArticleId_whenSearchArticles_thenReturnArticle() {


        ArticleDto articles = sut.searchArticles(1L);

        assertThat(articles).isNotNull();
    }


}