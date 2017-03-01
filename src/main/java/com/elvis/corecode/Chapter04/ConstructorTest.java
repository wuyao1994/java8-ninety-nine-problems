package com.elvis.corecode.Chapter04;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee3[] staff = new Employee3[3];
        staff[0] = new Employee3("harry", 40000);
        staff[1] = new Employee3(60000);
        staff[2] = new Employee3();
        
        for (Employee3 e : staff) {
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",id="+e.getId());
        }
    }
}

class Employee3 {
    private static int nextid;
    private int        id;
    private String     name;
    private double     salary;


    static {
        Random generator = new Random();
        nextid = generator.nextInt(10000);
    }
    
    {
        id = nextid;
        nextid++;
    }
    
    public Employee3(String n, double s) {
        name = n;
        salary = s;
    }
    
    public Employee3(double s) {
        this("Employee#" + nextid, s);
    }
    public Employee3(){
        
    }
    public int getId() {
        return id;
    }



    public void setId(int pId) {
        id = pId;
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

}