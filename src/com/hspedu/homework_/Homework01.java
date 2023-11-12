package com.hspedu.homework_;



//定义一个类Person类{name, age, job}, 初始化Person对象组，有3个person对象，并按照
//age从大到小排序，提示， 使用冒泡排序

public class Homework01 {

    public static void main(String[] args) {


        Person[] person = new Person[3];

        person[0] = new Person("jack", 11, "java工程师");
        person[1] = new Person("marry", 20, "IE工程师");
        person[2] = new Person("tom", 30, "前端工程师");


        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName()+ " " + person[i].getAge());
        }


        Person tmp = null;
        for (int i = 0; i < person.length - 1 ; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j+1].getAge()){
                    tmp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = tmp;

                }
            }
        }

        System.out.println("最终结果");

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName()+ " " + person[i].getAge()+ " " + person[i].getJob());
        }
    }
}

class Person{

    private String  name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

