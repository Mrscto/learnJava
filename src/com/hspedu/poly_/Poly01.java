package com.hspedu.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("tom");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大骨");
        Cat cat = new Cat("小猫");
        Fish fish = new Fish("黄花鱼");

        master.feed(dog, bone);
        master.feed(cat, fish);
    }
}
