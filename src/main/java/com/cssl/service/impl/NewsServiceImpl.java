package com.cssl.service.impl;

import com.cssl.dao.NewsDetailDao;
import com.cssl.pojo.NewsDetail;
import com.cssl.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {


    @Autowired
    private NewsDetailDao ndDao;

    @Override
    public List<NewsDetail> query() {
        return ndDao.select();
    }
}
