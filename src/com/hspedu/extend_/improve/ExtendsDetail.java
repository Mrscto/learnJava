package com.hspedu.extend_.improve;

import com.hspedu.extend_.Sub;

public class ExtendsDetail {
    public static void main(String[] args) {
        Sub sub = new Sub(); //创建了子类对象，sub
        sub.sayOk();
        System.out.println("=====创建第二个对象======");
        Sub sub2 = new Sub("Jack");
        sub2.sayOk();
        sub2.callTest400();
        System.out.println("=====创建第三个对象======");
        Sub sub3 = new Sub("smith", 12);
        sub3.sayOk();

    }
}
