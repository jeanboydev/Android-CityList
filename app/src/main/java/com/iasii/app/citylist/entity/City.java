package com.iasii.app.citylist.entity;

/**
 * Created by next on 2016/3/24.
 */
public class City {

    private String name;
    private String pinyin;

    public City(String name, String pinyin) {
        this.name = name;
        this.pinyin = pinyin;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}
