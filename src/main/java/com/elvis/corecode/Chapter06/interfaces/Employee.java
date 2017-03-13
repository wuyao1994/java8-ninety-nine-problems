package com.elvis.corecode.Chapter06.interfaces;

public class Employee implements Comparable<Employee>{
    private String name;
    private double Salary;
    
    public Employee(String pName, double pSalary) {
        name = pName;
        Salary = pSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return Salary;
    }
    public void rasise(double percent) {
        double raise = Salary * percent / 100;
        Salary += raise;
    }
    public int compareTo(Employee pArg0) {
        // TODO Auto-generated method stub
        return Double.compare(Salary, pArg0.Salary);
    }
    
}
