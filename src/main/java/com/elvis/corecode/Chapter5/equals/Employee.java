package com.elvis.corecode.Chapter5.equals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private Date   hireday;



    public Employee(String pName, double pSalary, int year, int month, int day) {
        name = pName;
        salary = pSalary;
        GregorianCalendar canlendar = new GregorianCalendar(year, month, day);
        hireday = canlendar.getTime();
    }



    public void raise(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }



    public String getName() {
        return name;
    }



    public double getSalary() {
        return salary;
    }



    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }

        if (otherObject == null) {
            return false;
        }

        if (getClass() != otherObject.getClass()) {
            return false;
        }

        Employee other = (Employee) otherObject;

        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireday, other.hireday);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireday);
    }



    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireday=" + hireday;
    }

}
