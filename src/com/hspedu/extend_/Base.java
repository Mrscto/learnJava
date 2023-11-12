package com.hspedu.extend_;

public class Base extends TopBase{
    public int n1 =100;
    protected int n2 =200;
    int n3 = 300;
    private int n4 =400;

    public Base() {//无参构造器
        System.out.println("无参构造器Base()....");
    }
    public Base(String name, int age) {//两个参数构造器
        System.out.println("调用两参数构造器Base()....");
    }

    public Base(String name) {//一个参数构造器
        System.out.println("一个参数的构造器Base()....");
    }

    public int getN4(){
        return n4;
    }
    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400() {
        System.out.println("test400");
    }
    //callTest400,调用test
    public void callTest400(){
        test400();
    }


}
