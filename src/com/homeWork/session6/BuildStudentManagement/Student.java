package com.homeWork.session6.BuildStudentManagement;

import java.util.Scanner;

public class Student {
    private String studentCode;
    private String name;
    private int age;
    private boolean sex;
    private String address;
    private String phone;

    public Student() {
    }

    public Student(String studentCode, String name, int age, boolean sex, String address, String phone) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã SV: ");
        studentCode = sc.nextLine();
        System.out.println("Họ và tên: ");
        name = sc.nextLine();
        System.out.println("Tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Giới tính: ");
        sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Địa chỉ: ");
        address = sc.nextLine();
        System.out.println("Số điện thoại: ");
        phone = sc.nextLine();
    }

    public void displayData() {
        System.out.printf("%-10s %-20s %-6s %-10s %-20s %-20s \n",getStudentCode(),getName(),getAge(),isSex()?"Nam":"Nữ",getAddress(),getPhone());
    }
}
