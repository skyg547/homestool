package com.e.homestool;

public class Sigeritem {

    String name;
    String moblie;
    int resId;

    @Override
    public String toString() {
        return "Sigeritem{" +
                "name='" + name + '\'' +
                ", moblie='" + moblie + '\'' +
                '}';
    }

    public Sigeritem(String name, String moblie,int resId) {
        this.name = name;
        this.moblie = moblie;
        this.resId = resId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }
}
