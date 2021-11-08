package com.thinking.machines.pojo;
public class Student {
    int roll;
    String name;
    char gender;

    public Student(int roll, String name, char gender) {
        this.roll = roll;
        this.name = name;
        this.gender = gender;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}