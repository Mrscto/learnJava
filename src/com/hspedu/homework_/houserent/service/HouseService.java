package com.hspedu.homework_.houserent.service;

/*
* HouseService.java<==>类[业务层]
* 定义House[]，保存House对象
* 1.响应HouseView的调用
* 2.完成对房屋信息的各种操作（增删改查）
*
*
* */

import com.hspedu.homework_.houserent.domain.House;

public class HouseService {


    private House[] houses; //保存house对象

    private int houseNum = 1; //记录当前有多少哥房屋信息

    private int idCounter =0 ;// 记录id自增次数

    public  HouseService(int size){

        houses = new House[size];// 指定数据大小

//        配合测试列表，初始化一个house对象

        houses[0] = new House(0,"jack","13356","顺德区",2000,"未出租");

    }

    public boolean add(House newHouse){
//        判断是否可以继续增加房屋信息

        if (houseNum == houses.length){

            System.out.println("数组已满，不能在添加了。。。");
            return false ;
        }

//        把房屋newHouse对象加入到，新增加了一个房屋
        houses[houseNum++] = newHouse;

//        idCounter++;
        newHouse.setId(++idCounter);

        return true;
    }

//    list方法 返回houses
    public House[] list() {
        return houses;
    }
}
