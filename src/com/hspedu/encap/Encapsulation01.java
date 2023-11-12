package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Patrick");
        person.setAge(40);
        person.setSalary(5000);
        System.out.println(person.info());
        System.out.println("此人年龄为" + person.getAge());

        // 如果我们使用构造器指定属性
        Person smith = new Person("smith",230,230000);

        System.out.println("===== smith的信息 ======");
        System.out.println(smith.info());
    }
}

/*
 在java中如何实现控制
 不能随意查看人的年龄，工资等隐私，并对设置的年龄进行合理设置，否则给默认年龄，
 必须在1-120，年龄，工资都不能随意查看，name的长度在2-6字符之间
*/


class Person{
    public String name ;
    private int age ;
    private double salary;
    public Person(){

    }


    //有三个参数的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        // set方法写在构造器中，这样仍然可以验证数据！
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6 ) {
            this.name = name;
        }else{
            System.out.println("名字字符长度不符合标准，默认名称为无名");
            this.name = "无名";
        }
    }

    public void setAge(int age) {
        if(age >=1 && age <=120){
            this.age = age;
        }else {
            System.out.println("设置年龄范围不合理,默认年龄18");
            this.age = 18;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "信息为 name = " + name + " age =" + age + " 薪水 = " + salary ;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}