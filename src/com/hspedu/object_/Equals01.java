package com.hspedu.object_;

public class Equals01 {

    public static void main(String[] args) {

        A a = new A();
        A b = a ;
        A c = b ;

        System.out.println(a == b);
        System.out.println(b == c);

        B b0jb = a ;

        System.out.println(b0jb == c);

        int num1  = 10;
        double num2 = 10.0;

        System.out.println(num1 == num2);

        System.out.println("hello".equals("hello"));

        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));

        String str1 = new String("adfada");
        String str2 = new String("adfada");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2) );
    }
}


class B {

}
class A extends B{

}