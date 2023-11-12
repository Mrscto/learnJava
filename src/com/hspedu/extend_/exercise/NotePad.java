package com.hspedu.extend_.exercise;

public class NotePad extends Computer{
    public String color;

    public NotePad(String cpu, int memory, int dick, String brand, String color){
        super(cpu,memory,dick);
        this.color = color ;
        System.out.println(cpu+ memory + dick + brand + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
