package com.hspedu.extend_;

public class Extend_01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 12 ;
        pupil.testing();
        pupil.setScore(90);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "小黄";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(70);
        graduate.showInfo();
    }
}
