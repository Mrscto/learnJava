package com.hspedu.extend_.exercise;

public class PC extends Computer{

    private String brand;


    //这里IDEA 根据继承规则，自动把构造器的调用写好。
    //这里也体现：继承设计的基本思想，父类的构造器完成父类构造器属性初始化
    //子类的构造器完成子类属性初始化
    public PC(String cpu, int memory, int dick, String brand) {
        super(cpu, memory, dick);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("PC信息如下=");
//        System.out.println(getCpu()+getBrand()+getDick()+getMemory());
//        调用父类的getDetails 方法，得到相关属性信息。。。
        System.out.println(getDetail() +" brand=" + brand);
    }

}
