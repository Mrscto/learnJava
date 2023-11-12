package com.hspedu.homework_.homework13;

public class Homework13 {
    public static void main(String[] args) {


        Student student = new Student("p",'男' ,21, "12232");

        student.printInfo();


        System.out.println("------------------------------------------");

        Teacher teacher = new Teacher("A", '女', 32, "13");

        teacher.printInfo();
        
//        多态数组

        Person[] persons = new Person[4];
        persons[0] = new Student("jack" ,'男', 10 , "0122");
        persons[1] = new Student("ja" ,'男', 20 , "12");
        persons[2] = new Teacher("jac" ,'男', 30 , "1");
        persons[3] = new Teacher("jacky" ,'男', 40 , "2");

        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);

        for (int i =0; i < persons.length; i++){
            System.out.println(persons[i]);
        }


        System.out.println("========================");
        for (int i = 0; i < persons.length; i++) {
            homework13.test(persons[i]);
        }


    }


    /*
    * 定义方法， 形参为Person类型，功能：调用学生的study或教师的teach方法
    * 分析这里需要使用向下转型和类型判断
    *
    * */

    public void test(Person p){
        if( p instanceof Student){
            ((Student) p).study();
        }else if(p instanceof Teacher) {
            ((Teacher)p).teach();
        }else{
            System.out.println("nothing i can do!");
        }
    }


    public void bubbleSort(Person[] persons){

        Person temp = null;


        for (int i = 0; i < persons.length -1  ; i++) {
            for (int j = 0; j < persons.length -1 - i; j++) {
                if ( persons[j].getAge() < persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }

//        for (int i = 0; i < persons.length  ; i++) {
//            System.out.println(persons[i].name+ "\t" + persons[i].getAge());
//        }

    }
}
