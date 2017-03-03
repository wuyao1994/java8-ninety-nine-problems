package com.elvis.corecode.Chapter5.equals;

public class Manager extends Employee {
    private double bonus;



    public Manager(String pName, double pSalary, int pYear, int pMonth, int pDay) {
        super(pName, pSalary, pYear, pMonth, pDay);
        bonus = 0;
    }



    public void setBonus(double pBonus) {
        bonus = pBonus;
    }



    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }



    @Override
    public int hashCode() {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }



    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }
    


    @Override
    public String toString() {
        return super.toString()+"[bonus=" + bonus + "]";
    }
    
}
