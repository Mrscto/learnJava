package com.hspedu.poly_.polyparameter_;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    //重新计算年薪
    public double getAnnual() {
        return super.getAnnual() + getBonus();
    }

    public void manage(){
        System.out.println("经理" + getName() + "正在管理！");
    }
}
