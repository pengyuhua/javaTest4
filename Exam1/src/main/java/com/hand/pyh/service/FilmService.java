package com.hand.pyh.service;

import com.hand.pyh.bean.Film;

public interface FilmService {

    int insertFilm();

    Film queryFilm(int film_id);
}
