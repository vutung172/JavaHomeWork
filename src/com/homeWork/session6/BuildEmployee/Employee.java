package com.homeWork.session6.BuildEmployee;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean sex;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, boolean sex, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.sex = sex;
        this.rate = rate;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("社員のIDを入力ください: ");
        employeeId = sc.nextLine();
        System.out.println("氏名を入力ください: ");
        employeeName = sc.nextLine();
        System.out.println("年齢を入力ください: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("性別を入力ください");
        sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("係数を入力ください");
        rate = Double.parseDouble(sc.nextLine());
    }

    public void displayData(){
        System.out.printf("%s %s %s %s %s",getEmployeeId(),getEmployeeName(),getAge(),isSex()?"男性":"女性",getRate());
    }

    public double calSalary(){
        return rate * 1300000;
    }
}
