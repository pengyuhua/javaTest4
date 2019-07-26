package com.hand.pyh.service;

import com.hand.pyh.bean.Film;
import com.hand.pyh.bean.Page;

import java.util.List;

public interface FilmService {

    int insertFilm();

    Film queryFilm(int film_id);

    List<Film> listFilm(Page page);
}
