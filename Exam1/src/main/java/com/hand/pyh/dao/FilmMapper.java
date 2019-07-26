package com.hand.pyh.dao;

import com.hand.pyh.bean.Film;
import org.springframework.stereotype.Repository;


@Repository
public interface FilmMapper {

    Integer insertFilm(Film film);

    Film queryFilm(int film_id);

}
