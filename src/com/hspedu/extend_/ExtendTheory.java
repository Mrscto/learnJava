package com.hspedu.extend_;

public class ExtendTheory {
    public static void main(String[] args) {

        Son son = new Son();
    }
}


class Grandpa{
    String name ="大头爷爷";
    String hobby="旅游";
}

class Father extends Grandpa{
    String name ="大头爸爸";
    int age = 39;
}

class Son extends Father{
    String name ="大头儿子";
}