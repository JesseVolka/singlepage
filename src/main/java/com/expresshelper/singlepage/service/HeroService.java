package com.expresshelper.singlepage.service;

/**
 * @author fanminfeng
 * @version 1.0
 * _                 __      __   _ _
 * | |                \ \    / /  | | |
 * | | ___  ___ ___  __\ \  / /__ | | | ____ _
 * _   | |/ _ \/ __/ __|/ _ \ \/ / _ \| | |/ / _` |
 * | |__| |  __/\__ \__ \  __/\  / (_) | |   < (_| |
 * \____/ \___||___/___/\___| \/ \___/|_|_|\_\__,_|
 * @date 2019/8/29 下午2:45
 */
import com.expresshelper.singlepage.pojo.Hero;

import java.util.List;


public interface HeroService {
    public int add(Hero hero);

    public void delete(int id);

    public Hero get(int id);

    public int update(Hero hero);

    public List<Hero> list();
}
