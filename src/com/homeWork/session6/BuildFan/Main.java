package com.homeWork.session6.BuildFan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setOn(true);
        fan.setSpeed(fan.FAST);
        fan.setRadius(10);
        fan.setColor("yellow");
        System.out.println("Fan 1: "+"tốc độ quạt: "+fan.getSpeed()+", radius của quạt: "+fan.getRadius()+", color của quạt: "+fan.getColor()+", trạng thái quạt: "+(fan.isOn()?"bật":"tắt"));

        fan = new Fan();
        fan.setSpeed(fan.MEDIUM);
        System.out.println("Fan 2: "+"tốc độ quạt: "+fan.getSpeed()+", radius của quạt: "+fan.getRadius()+", color của quạt: "+fan.getColor()+", trạng thái quạt: "+(fan.isOn()?"bật":"tắt"));

    }
}
