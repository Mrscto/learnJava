package com.hspedu.homework_;

public class Manager extends Employee{

//    特有属性
    private double bonus;


//    创造Manager对象时,奖金是多少并不是确定的,因为老师在构造中不给bonus
//    可以通过setBonus
    public Manager(String name, double daySal, double workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
//        super.printSalary();
        System.out.println(getName() + "工资是:" + (bonus + getDaySal() * getWorkDays() * getGrade()) );
    }
}
