package com.hspedu.extend_;

public class Sub extends Base{

    public Sub(String name,int age){
        super(); //默认调用父类无参构造器
//        super("jack");
        System.out.println("子类构造器Sub(String name , int age)被调用...");
    }
    public Sub(){//构造器
        super("smith", 10); //默认调用父类无参构造器
        System.out.println("子类无参构造器Sub()被调用....");
    }
    public Sub(String name){
        super("jacky",20);
        System.out.println("子类Sub(String name)被调用...");
    }

    public void sayOk(){
        //非私有的属性方法，都是可以访问的
        //私有的属性方法不可以直接访问，需要通过公共方法访问
        //需要通过父类公共方法访问
        System.out.println(n1+n2+n3+ getN4());
        test100();
        test200();
        test300();
        //test400(); //私有方法无法直接访问
    }
}
