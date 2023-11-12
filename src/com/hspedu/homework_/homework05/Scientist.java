package com.hspedu.homework_.homework05;

public class Scientist extends  Employee{

    private double bonus;

    public Scientist(double salary, String name) {
        super(salary, name);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
//        super.printSal();

        System.out.println(getName() + "年工资是 ：" + (getSalary() * getSalMonth() + bonus));
    }
}
