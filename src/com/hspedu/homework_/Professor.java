package com.hspedu.homework_;

public class Professor extends Teacher{

    private String gradeName;


    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
        this.gradeName = gradeName;
    }

    @Override
    public void introduce() {
        System.out.println("这是教授信息");
        super.introduce();
    }
}
