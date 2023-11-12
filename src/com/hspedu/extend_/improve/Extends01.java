package com.hspedu.extend_.improve;

import com.hspedu.extend_.Graduate;
import com.hspedu.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.hspedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 12 ;
        pupil.testing();
        pupil.setScore(90);
        pupil.showInfo();

        com.hspedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "小黄";
        graduate.age = 25;
        graduate.testing();
        graduate.setScore(70);
        graduate.showInfo();
    }
}
