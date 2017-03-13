package com.elvis.corecode.Chapter06.clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {
    private String name;
    private double salary;
    private Date   hireday;



    public Employee(String pName, double pSalary) {
        name = pName;
        salary = pSalary;
        hireday = new Date();
    }



    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireday = (Date)hireday.clone();
        return cloned;
    }



    public void setHireday(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireday.setTime(newHireDay.getTime());
    }
    
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }



    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", hireday=" + hireday + "]";
    }
}
