package com.hspedu.poly_.detail_;

public class PolyDetail {

    public static void main(String[] args) {

//        向上转型：父类的引用指向子类的对象
//        语法：父类类型引用名 = new 子类类型（）：

        Animal animal = new Cat();
        Object obj = new Cat();


//        可以调用父类中所有成员（需要遵守访问权限）
//        但是不能调用子类中特有成员
//        因为在编译阶段，能调用哪些成员是由编译类型类决定的
//        animal.catchMouse(); 错误
//        animal.show();
//        最终运行效果看子类（运行类型）的具体实现，即调用方法时，按照子类（运行类型）开始查找方法
//                然后调用，规则我前面我们讲的方法调用一致
        animal.eat();
        animal.run();
        animal.sleep();
        System.out.println("ok~");

//        希望子类catchMouse 特有方法可以使用
//        多态向下转型

//        语法： 子类类型 引用名 = (子类类型) 父类引用;
        Cat cat =  (Cat) animal;
        cat.catchMouse();
//        要求父类的引用必须指向的是当前目标类型的对象

    }
}
