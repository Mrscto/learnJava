package com.hspedu.homework_.homework13;

public class Teacher extends Person{

    public String work_age;

    public Teacher(String name, char gender, int age, String work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public String getWork_age() {
        return work_age;
    }

    public void setWork_age(String work_age) {
        this.work_age = work_age;
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void teach(){
        System.out.println(getName() + "我承诺，我会好好教学");
    }

    public void printInfo() {
        System.out.println("教师信息：" + "\n" + "姓名：" + getName() + "\n" + "年龄：" + getAge()
                + "\n" + "性别：" + getGender() + "\n" + "教龄：" + getWork_age()
        );
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age='" + work_age + '\'' +
                '}' + super.toString();
    }
}
