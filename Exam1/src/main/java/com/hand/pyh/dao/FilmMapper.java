package com.hand.pyh.dao;

import com.hand.pyh.bean.Film;
import com.hand.pyh.bean.Page;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FilmMapper {

    Integer insertFilm(Film film);

    Film queryFilm(int film_id);

    List<Film> listFilm(Page page);

}
