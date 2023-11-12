package com.hspedu.homework_;

public class Employee {


    private String name;
    private double daySal;
    private double workDays;
    private double grade;

    public Employee(String name, double daySal, double workDays, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public double getWorkDays() {
        return workDays;
    }

    public void setWorkDays(double workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printSalary(){
        System.out.println(name + "工资等于：" + daySal*workDays*grade);
    }
}
