package com.elvis.corecode.Chapter5.abstractClasses;

public abstract class Person {
    private String name;



    public Person(String n) {
        name = n;
    }



    public abstract String getDescription();



    public String getName() {
        return name;
    }
}
