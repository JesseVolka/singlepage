package com.expresshelper.singlepage.pojo;

/**
 * @author fanminfeng
 * @version 1.0
 * _                 __      __   _ _
 * | |                \ \    / /  | | |
 * | | ___  ___ ___  __\ \  / /__ | | | ____ _
 * _   | |/ _ \/ __/ __|/ _ \ \/ / _ \| | |/ / _` |
 * | |__| |  __/\__ \__ \  __/\  / (_) | |   < (_| |
 * \____/ \___||___/___/\___| \/ \___/|_|_|\_\__,_|
 * @date 2019/8/29 下午2:41
 */

public class Hero {

    private int id;

    private String name;
    private int hp;

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Hero [id=" + id + ", name=" + name + ", hp=" + hp + "]";
    }

}