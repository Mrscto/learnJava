package com.hspedu.poly_.polyparameter_;

public class Worker extends Employee {


    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工" + getName() + "正在工作！");
    }

    @Override
    public double getAnnual() {
        //普通员工没有额外收入
        return super.getAnnual();
    }

}
