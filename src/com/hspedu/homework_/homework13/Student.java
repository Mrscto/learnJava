package com.hspedu.homework_.homework13;

public class Student extends Person{


/*
student类有名称（name)，性别（sex），年龄（age） ，学号（stu_id_),
做合理封装，通过构造器在创建对象时将4个属性赋值。

学生需要有学习方法，是study 在方法中写 “我承诺，我会好好学习


* */
    private String stu_id;

    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public void study(){
        System.out.println(getName() + "我承诺，我会好好学习");
    }


    public void printInfo(){
        System.out.println("学生信息："+ "\n"+ "姓名："+ getName() + "\n" + "年龄：" + getAge()
        +"\n"+ "性别："+ getGender()+ "\n"+"学号："+ getStu_id()
        );
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}
