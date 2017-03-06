package com.elvis.corecode.Chapter5;

public class Manager extends Employee {

    private double bonus;



    public Manager(String pName, double pSalary, int pYear, int pMonth, int pDay) {
        super(pName, pSalary, pYear, pMonth, pDay);
        bonus = 0;
    }
    
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    
    public void setBouns(double b) {
        bonus = b;
    }

}
