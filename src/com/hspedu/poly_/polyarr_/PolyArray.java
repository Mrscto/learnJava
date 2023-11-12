package com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        //应用实例：现有一个继承结构如下：要求创建一个Person对象
//        2个Student对象和2个Teacher对象，统一放在数组中，并调用每个对象say方法

        Person[] persons = new Person[5] ;

        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 20,120);
        persons[2] = new Student("jack", 20, 210);
        persons[3] = new Teacher("jack", 20,23004);
        persons[4] = new Teacher("jack", 20, 20000);


        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());

            if(persons[i] instanceof Student){
                ((Student)persons[i]).study();
            }else if (persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
            } else {
                System.out.println("类型有误，重新判断");
            }
        }


    }
}
