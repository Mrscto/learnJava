package com.hspedu.object_;

public class EqualsExercise03 {
    public static void main(String[] args) {

        int it = 65;
        float fl = 65.0f;
        System.out.println("65 和65.0f 是否相等" + (it == fl));

        char ch1 = 'A'; char ch2 = 12;
        System.out.println("65和'A'是否相等" + (it == ch1));//acsII码
        System.out.println("12 和 ch2 是否相等" + (12 == ch2));

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
//        System.out.println("hello" == new java.sql.Date());
    }
}
