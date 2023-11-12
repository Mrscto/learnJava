package com.hspedu.extend_.exercise;


//编写Computer类，包含CPU、内存、硬盘等属性，getDetail方法用于返回Computer的详细信息
public class Computer {
    private String cpu;
    private int memory;
    private int dick;
    public Computer(String cpu,int memory,int dick){
        this.cpu = cpu;
        this.memory = memory;
        this.dick = dick;
    }

    public Computer(){

    }


    public String getDetail(){
        return "cpu=" + cpu + " memory=" + memory + " dick=" + dick ;
    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDick() {
        return dick;
    }

    public void setDick(int dick) {
        this.dick = dick;
    }
}
