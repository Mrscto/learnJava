package com.hspedu.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person = new Person("Patrick", 10, '男');
        Person person1 = new Person("Patrick", 10, '男');

        System.out.println(person1.equals(person));

    }
}

class Person{

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        //判断类型
        if (obj instanceof Person) {
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }

        return false;
    }
}