package com.hspedu.poly_;

public class PolyMethod {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        System.out.println(a.sum(12,12));
        System.out.println(a.sum(12,12,12));
        a.say();
        b.say();
    }
}

class B{
    public  void say(){
        System.out.println("B say()方法被调用...");
    }

}

class A extends B{
    public int sum(int n1, int n2){
        return n1 + n2;
    }

    public int sum(int n1 ,int n2, int n3){
        return n1 + n2 + n3;

    }

    public void say(){
        System.out.println("A say()方法被调用...");
    }
}