package com.elvis.corecode.Chapter5;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private double salary;
    private Date   hireDay;



    public Employee(String pName, double pSalary, int year, int month, int day) {
        name = pName;
        salary = pSalary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }



    public String getName() {
        return name;
    }



    public double getSalary() {
        return salary;
    }



    public Date getHireDay() {
        return hireDay;
    }



    public void raiseSalay(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
