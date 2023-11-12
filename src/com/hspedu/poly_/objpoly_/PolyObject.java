package com.hspedu.poly_.objpoly_;

public class PolyObject {
    public static void main(String[] args) {

        //体验对象多态特点

        //animal 编译类型为Animal ,运行类型时 Dog

        Animal animal = new Dog();
        animal.cry(); //因为运行时，这时就执行该行时，animal运行类型就是Dog，所以cry就是Dog的cry

        animal = new Cat();
        animal.cry();
    }


//    对象多态
//    1、一个对象的编译类型和运行类型可以不一致
//    2、编译类型在定义对象时，就可以确定了，不能改变
//    3、运行类型是可以变化的
//    4、编译类型看定义时 = 号的左边，运行类型看 = 号的右边
}
