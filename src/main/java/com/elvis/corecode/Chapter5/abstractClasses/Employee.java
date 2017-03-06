package com.elvis.corecode.Chapter5.abstractClasses;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person {
    private double salary;
    private Date   hireday;



    public Employee(String pN, double pSalary, int year, int month, int day) {
        super(pN);
        salary = pSalary;
        GregorianCalendar canlendar = new GregorianCalendar(year, month - 1, day);
        hireday = canlendar.getTime();
    }



    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }



    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }



    public double getSalary() {
        return salary;
    }



    public Date getHireday() {
        return hireday;
    }

}
