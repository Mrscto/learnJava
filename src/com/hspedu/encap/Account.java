package com.hspedu.encap;

/*
Account类要求具有属性：姓名（长度为2、3、4位）、余额（必须大于20）、
密码（必须是六位），如果不满足则给出提示信息，并给出默认值！

 */

public class Account {
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器
    public Account(){

    }

    public Account(String name, double balance, String pwd) {
        this.name = name;
        this.balance = balance;
        this.pwd = pwd;

        setName(name);
        setPwd(pwd);
        setBalance(balance);
    }

    public void setName(String name) {
        if (name.length() >=2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("名字设置不正确，默认为无名氏");
            this.name = "无名氏";
        }
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        }else{
            System.out.println("余额不足20，必须大于20，默认数据为0");
            this.balance = 0;
        }

    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        }else{
            System.out.println("密码必须为六位，默认为123456");
            this.pwd = "123456";
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String  getPwd() {
        return pwd;
    }

    public void showInfo(){
        System.out.println("账号信息 name = " + name + ", 余额 = " + balance + ", 密码 = " + pwd);
    }
}


