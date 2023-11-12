package com.hspedu.homework_.houserent.view;


/*
* 1.显示界面
* 2.接收用户输入
* 3.调用HouseService
* */

import com.hspedu.homework_.houserent.domain.House;
import com.hspedu.homework_.houserent.service.HouseService;
import com.hspedu.homework_.houserent.utils.Utility;

public class HouseView {


    private boolean loop = true; //控制显示菜单
    private char key = ' '; // 接收用户选择

    private HouseService houseService = new HouseService(10);


    public void listHouse(){
        System.out.println("=============房屋列表=============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list(); //得到所有房屋信息

        for (int i = 0 ;i < houses.length ; i++){

            if (houses[i] == null) {
                break;
            }else{
                houseService.toString();
            }

            System.out.println(houses[i]);

        }
        System.out.println("=============房屋列表显示完毕=============");
    }

    public void addHouse(){
        System.out.println("=============添加房屋=============");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);

//        创建一个新的house对象，注意id是系统分配的。

        House newHouse = new House(0,name, phone, address, rent, state);

        if (houseService.add(newHouse)){
            System.out.println("=============添加房屋成功=============");
        }else{
            System.out.println("=============添加房屋失败=============");
        }

    }

    public void deleteHouse(){

    }


    public void mainMenu(){
        do {
            System.out.println("\n=============房屋出租信息系统=============");
            System.out.println("\t\t\t 1. 新 增 房 源");
            System.out.println("\t\t\t 2. 查 找 房 源");
            System.out.println("\t\t\t 3. 删 除 房 源");
            System.out.println("\t\t\t 4. 修 改 房 屋 信 息");
            System.out.println("\t\t\t 5. 房 屋 列 表");
            System.out.println("\t\t\t 6. 退       出");
            System.out.println("请输入你的选择（1-6）：");

            key = Utility.readChar();
            switch (key){
                case '1' :
                    System.out.println("新增");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    break;
                case '3':
                    System.out.println("删除");
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    System.out.println("列表");
                    listHouse();
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;




            }



        }while(loop);
    }
}
