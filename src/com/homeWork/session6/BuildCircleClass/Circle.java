package com.homeWork.session6.BuildCircleClass;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;
    private final double pi = 3.14;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getPi() {
        return pi;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input radius: ");
        radius = Double.parseDouble(sc.nextLine());
        System.out.println("Please input color: ");
        color = sc.nextLine();
    }

    public void displayData(){
        System.out.println("Radius of circle: "+radius);
        System.out.println("Color of circle: "+color);

    }

    public double calArea(){
        return radius*radius*pi;
    }

    public double calPerimeter(){
       return 2*pi*radius;

    }
}
