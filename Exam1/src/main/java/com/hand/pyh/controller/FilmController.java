package com.hand.pyh.controller;


import com.hand.pyh.bean.Film;
import com.hand.pyh.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping("/create")
    public String createFilm(){
        return filmService.insertFilm() >=1 ? "{\"create_status\":true}": "{\"create_status\":false}";
    }
}
