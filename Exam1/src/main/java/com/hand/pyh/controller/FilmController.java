package com.hand.pyh.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hand.pyh.annotation.ConvertPage;
import com.hand.pyh.bean.Film;
import com.hand.pyh.bean.Page;
import com.hand.pyh.service.FilmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/films")
public class FilmController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private FilmService filmService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createFilm(){
        return filmService.insertFilm() >=1 ? "{\"create_status\":true}": "{\"create_status\":false}";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listFilms(@ConvertPage Page page){
        int page_num = page.getPage();
        int pageSize_num = page.getPageSize();
        logger.info("控制器自定义参数解析器解析数据:");
        logger.info("page_num:" + String.valueOf(page_num));
        logger.info("pageSize_num:" + String.valueOf(pageSize_num));

        try {
            return objectMapper.writeValueAsString(filmService.listFilm(page));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "[]";
        }
    }
}
