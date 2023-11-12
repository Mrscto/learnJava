package com.hspedu.poly_.polyparameter_;

public class Employee {

    private String name;//名称

    private double salary; // 月工资

    public double getAnnual(){
        return salary * 12;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
