package com.elvis.corecode.Chapter5.abstractClasses;

public class Student extends Person {
    private String major;



    public Student(String pN, String pMajor) {
        super(pN);
        major = pMajor;
    }



    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
