package com.homeWork.session6.BuildQuadraticEquationClass;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        double delta;
        return delta = b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b + Math.pow(this.getDiscriminant(),0.5))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.pow(this.getDiscriminant(),0.5))/(2*a);
    }
}
