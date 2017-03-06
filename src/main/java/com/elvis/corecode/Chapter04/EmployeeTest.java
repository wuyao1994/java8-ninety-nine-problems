package com.elvis.corecode.Chapter04;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Craker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        for (Employee e : staff) {
            e.raiseSalay(5);
        }
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private Date   hireDay;



    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }



    public void raiseSalay(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }



    public String getName() {
        return name;
    }



    public void setName(String pName) {
        name = pName;
    }



    public double getSalary() {
        return salary;
    }



    public void setSalary(double pSalary) {
        salary = pSalary;
    }



    public Date getHireDay() {
        return hireDay;
    }



    public void setHireDay(Date pHireDay) {
        hireDay = pHireDay;
    }

}
