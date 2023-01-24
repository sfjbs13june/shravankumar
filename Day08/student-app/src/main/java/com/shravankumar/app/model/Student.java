package com.shravankumar.app.model;

public class Student {
    String name;
    String roll;
    String std;



    String schoolname;

    public Student(String name, String roll, String std, String schoolname) {
        this.name = name;
        this.roll = roll;
        this.std = std;
        this.schoolname = schoolname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }


}
