package com.hspedu.homework_.houserent;

import com.hspedu.homework_.houserent.domain.House;
import com.hspedu.homework_.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        // 创建HouseView对象，并显示主菜单，是整个程序的入口

        House house = new House(1, "patrick", "1221121", "new your", 12, "未出租");
        System.out.println(house.toString());

        new HouseView().mainMenu();
        System.out.println("==你退出了房屋出租系统==");
    }
}
