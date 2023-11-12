package com.hspedu.poly_;

public class Master {

    private String name;

    public Master(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //主人给动物分配食物
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人给" + name + "给" + dog.getName() + "吃" + bone.getName());
//    }
//
//    public void feed(Cat cat,Fish fish){
//        System.out.println("主人给" + name + "给" + cat.getName() + "喂" + fish.getName());
//    }



//    animal 编译类型是Animal，可以指向（接收）Animal子类的对象
//    food 编译类型是Food ，可以指向（接收）Food子类的对象
    public void feed(Animal animal,Food food){
        System.out.println("主人给" + name + "给" + animal.getName() + "喂" + food.getName());
    }


}
