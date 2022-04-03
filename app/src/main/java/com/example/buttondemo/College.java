package com.example.buttondemo;

public class College {
    protected String name;
    protected int collegeId;

    public College(String name, int collegeId) {
        this.name = name;
        this.collegeId = collegeId;
    }

    public String getName(){
        return this.name;
    }
    public int getCollegeId(){
        return this.collegeId;
    }
}
