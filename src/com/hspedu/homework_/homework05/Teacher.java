package com.hspedu.homework_.homework05;

public class Teacher extends Employee{

    private double classDay;
    private double classSal;

    public Teacher(double salary, String name, double classDay, double classSal) {
        super(salary, name);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    @Override
    public void printSal() {
//        super.printSal();

        System.out.println(getName() + " 年工资 ： " + (getSalary() * getSalMonth() +
                classSal * classDay));
    }
}
