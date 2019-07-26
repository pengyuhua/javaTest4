package com.hand.pyh.service.serviceImpl;

import com.hand.pyh.bean.Film;
import com.hand.pyh.dao.FilmMapper;
import com.hand.pyh.service.FilmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FilmServiceImpl implements FilmService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public int insertFilm() {
        Film film = new Film("复仇者连连看", 1, 6,
                2.01, 24.99);
        int result = filmMapper.insertFilm(film);
        int insertDataId = film.getFilm_id();
        logger.info("添加结果:" + (result >= 1? "成功!": "失败!"));
        logger.info("添加结果检索信息:新添加数据编号:" + insertDataId );
//        logger.info(queryFilm(insertDataId).toString());
        return result;
    }

    @Override
    public Film queryFilm(int film_id) {
        return filmMapper.queryFilm(film_id);
    }

}
