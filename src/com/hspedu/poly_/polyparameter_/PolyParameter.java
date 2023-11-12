package com.hspedu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {

        Worker tom = new Worker("Tom", 2500);
        Manager milan = new Manager("milan", 23000);

        PolyParameter polyParameter = new PolyParameter();
        polyParameter.shouEmpAnnual(tom);
        polyParameter.shouEmpAnnual(milan);

        polyParameter.testWork(tom);
        polyParameter.testWork(milan);

    }

    //shouEmpAnnual(Employee e)

    public void shouEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e){

        if (e instanceof  Worker){
            ((Worker) e).work(); //向下转型的操作
        } else if (e instanceof  Manager) {
            ((Manager) e).manage();
        }else{
            System.out.println("不作操作");
        }
    }
}
