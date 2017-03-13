package com.elvis.corecode.Chapter06.clone;

public class CloneTest {

    public static void main(String[] args) {
        try {
            Employee original = new Employee("John", 50000);
            original.setHireday(2000, 1, 1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireday(2002, 2, 2);
            System.out.println("original="+original);
            System.out.println("copy="+copy);
        } catch (Exception e) {
            
            // TODO: handle exception
        }
    }

}
