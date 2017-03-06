package com.elvis.corecode.Chapter5.abstractClasses;

public class PersonTest {

    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000, 1987, 12, 5);
        people[1] = new Student("Maria Morris", "computer science");
        for (Person p : people) {
            System.out.println(p.getName() + "," + p.getDescription());
        }
    }

}
