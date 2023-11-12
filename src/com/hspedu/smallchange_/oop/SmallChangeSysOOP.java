package com.hspedu.smallchange_.oop;

/*
该类是完成零钱通的各个功能的类
使用OOP（面向对象编成）
将各个功能对应一个方法

*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {

    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";


//        2.完成零钱通明细
//        （1）可以把收益入账和消费，保存到数组（2）可以使用对象（3）简单的话可以使用String拼接

    String detail = "--------------零钱通明细--------------";

//        3.完成收益入账， 完成功能驱动程序员增加新变化和代码
//        定义新变量


    Date date = null; // date 是java.util.Date 类型，表示日期

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    //        时间格式化
    double money = 0;
    double balance = 0;

    //        4.消费
//        消费说明，消费原因
    String note = null;

    //    先完成显示菜单，并可以选择
    public void mainMenu() {


        do {
            System.out.println("=================零钱通菜单=================");
            System.out.println("\t\t\t 1.零钱通明细");
            System.out.println("\t\t\t 2.收益入账");
            System.out.println("\t\t\t 3.消费");
            System.out.println("\t\t\t 4.退      出");

            System.out.println("请选择（1-4—）：");

            key = scanner.next();

            //使用switch 分支控制
            switch (key) {
                case "1":
                    this.showDetail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
//                    loop = false;
                    break;

            }

        } while (loop);
    }


    public void showDetail() {

        System.out.println(detail);
    }

    public void income() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        // money的值范围应该校验

        if (money <= 0) {
            System.out.println("输入金额范围需要大于0");
            return;
        }


        balance += money;

        //拼接收益入账信息到details
        date = new Date();
//                    System.out.println(sdf.format(date));
        detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;

    }

    public void pay() {

        System.out.println("消费金额：");
        money = scanner.nextDouble();
        // money的值范围应该校验

        if (money <= 0 || money > balance) {
            System.out.println("你的消费金额 应该在 0 - " + balance);
            return;
        }

        System.out.println("消费原因：");
        note = scanner.next();
        date = new Date();
        balance -= money;

        detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
        return;
    }

    public void exit() {
        String choice = "";


        while (true) {
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }

        if ("y".equals(choice)) {
            System.out.println("4.退      出");
            loop = false;
        }
        return;
    }
}