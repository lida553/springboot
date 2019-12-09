package com.zimug.bootlaunch.service;

import com.zimug.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ArticleRestJDBCServiceImpl implements ArticleRestService {

    //注入jdbc
    @Resource
    ArticleJDBCDAO articleJDBCDAO;
    public Article saveArticle( Article article) {
        articleJDBCDAO.save(article);
        return  article;
    }

    @Override
    public void deleteArticle(Long id) {

    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public Article getArticle(Long id) {
        return null;
    }

    @Override
    public List<Article> getAll() {
        return null;
    }

    private class ArticleJDBCDAO {
    }
}
