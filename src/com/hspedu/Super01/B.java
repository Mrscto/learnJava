package com.hspedu.Super01;

public class B extends A{
//    访问父类的属性，但不能访问父类private属性[案例]super.属性名

    public int n1 = 8888;

    public void hi(){
        System.out.println(super.n1 + super.n2 + super.n3);
    }

    public void sum(){
        System.out.println("B类的sum()方法...");
        //希望调用父类A的cal方法
        super.cal(); //直接搜索父类cal方法。
        this.cal(); //等价于cal()
        cal();//先找本类，如果有则调用，否 ，则找父类。。。依此类推

        System.out.println("父类N1: "+super.n1 + "本类N1: "+ this.n1+"本类N1: "+ n1);
    }
    //    访问父类的方法，但不能访问父类private属性[案例]super.属性名
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }

//    访问父类的构造器（这点前面用过）：super（参数列表）；只能放在构造器的第一句，只能出现一句！
    public B(){
        super();
    }
}
