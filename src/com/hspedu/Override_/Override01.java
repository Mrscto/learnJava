package com.hspedu.Override_;

public class Override01 {
    public static void main(String[] args) {
        //演示方法重写的情况
        Dog dog = new Dog();
        dog.cry();//

        Student patrick = new Student("Patrick", 32, 98.0, 12306);
        System.out.println(patrick.say());
        Person person = new Person("jack",10);
        System.out.println(person.say());
    }


}
