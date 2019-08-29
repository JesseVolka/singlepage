package com.expresshelper.singlepage.service.impl;

/**
 * @author fanminfeng
 * @version 1.0
 * _                 __      __   _ _
 * | |                \ \    / /  | | |
 * | | ___  ___ ___  __\ \  / /__ | | | ____ _
 * _   | |/ _ \/ __/ __|/ _ \ \/ / _ \| | |/ / _` |
 * | |__| |  __/\__ \__ \  __/\  / (_) | |   < (_| |
 * \____/ \___||___/___/\___| \/ \___/|_|_|\_\__,_|
 * @date 2019/8/29 下午2:46
 */

import java.util.List;

import com.expresshelper.singlepage.mapper.HeroMapper;
import com.expresshelper.singlepage.pojo.Hero;
import com.expresshelper.singlepage.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    HeroMapper heroMapper;

    @Override
    public int add(Hero hero) {
        return heroMapper.add(hero);
    }

    @Override
    public void delete(int id) {
        heroMapper.delete(id);
    }

    @Override
    public Hero get(int id) {
        return heroMapper.get(id);
    }

    @Override
    public int update(Hero hero) {
        return heroMapper.update(hero);
    }

    @Override
    public List<Hero> list() {
        return heroMapper.list();
    }

}
