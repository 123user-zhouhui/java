package com.cssl.controller;

import com.cssl.pojo.NewsDetail;
import com.cssl.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsService service;

    @ResponseBody
    @GetMapping("/find")
    public List<NewsDetail> find(int pageIndex){
        System.out.println("find..."+pageIndex);
        return service.query();
    }
}
