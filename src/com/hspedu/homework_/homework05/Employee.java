package com.hspedu.homework_.homework05;

public class Employee {

    private double salary;
    private String name;
    private double salMonth =  12 ;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(double salMonth) {
        this.salMonth = salMonth;
    }

    public void printSal(){
        System.out.println( name + " 年工资是： " + (salary * salMonth));
    }
}
