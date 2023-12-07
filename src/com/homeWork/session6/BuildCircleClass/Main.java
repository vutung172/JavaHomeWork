package com.homeWork.session6.BuildCircleClass;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5,"red");
        Circle circle2 = new Circle(10,"blue");
        circle1.displayData();
        System.out.println("Diện tích vòng hình tròn 1: "+circle1.calArea());
        System.out.println("Chu vi hình trong 1: "+circle1.calPerimeter());
        circle2.displayData();
        System.out.println("Diện tích vòng hình tròn 2: "+circle2.calArea());
        System.out.println("Chu vi hình trong 2: "+circle2.calPerimeter());
    }
}
