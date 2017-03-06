package com.elvis.corecode.Chapter04;

public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);//10
        tripleValue(percent);
        System.out.println("After: percent=" + percent);//10
        
        System.out.println("\nTest tripleSalay");
        Employee2 harry = new Employee2("Harry", 50000);
        System.out.println("Before: salary="+ harry.getSalary());//50000
        tripleSalary(harry);
        System.out.println("After: salary="+ harry.getSalary());//150000
        
        System.out.println("\nTesting swap:");
        Employee2 a = new Employee2("Alice", 70000);
        Employee2 b = new Employee2("Bob", 60000);
        System.out.println("Before: a=" + a.getName());//Alice
        System.out.println("Before: b=" + b.getName());//Bob
        swap(a, b);
        System.out.println("After: a=" + a.getName());//Alice
        System.out.println("After: b=" + b.getName());//Bob
        
    }
    public static void tripleValue(double x) {
        x = x * 3;
        System.out.println("End of method: x=" + x);
    }
    public static void tripleSalary(Employee2 x) {
        x.raiseSalary(200);
        System.out.println("End od method");
    }
    public static void swap(Employee2 x, Employee2 y) {
        Employee2 temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class Employee2 {
    private String name;
    private double salary;
    
    public Employee2(String n, double s) {
        name = n;
        salary= s;
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
    
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
