package com.homeWork.session6.BuildStudentManagement;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] list = new Student[100];
        do {
            System.out.println("======MENU QUẢN LÝ SINH VIÊN======");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm sinh viên mới");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (list[0] != null) {
                        System.out.println("Danh sách sinh viên:");
                        System.out.printf("%-5s %-20s %-6s %-10s %-20s %-20s \n", "Mã SV", "Họ và tên", "Tuổi", "Giới tính", "Địa chỉ", "Số điện thoại");
                        for (Student student : list) {
                            if (student != null) {
                                student.displayData();
                            }
                        }
                    } else {
                        System.out.println("Không có phần tử nào trong mảng");
                    }
                    break;
                case 2:
                    for (int i = 0; i < list.length; i++) {
                        if (list[i] == null) {
                            Student student = new Student();
                            student.inputData();
                            list[i] = student;
                            break;
                        }
                    }
                    break;
//                    Sửa thông tin sinh viên
                case 3:
                    break;
//                    Xóa sinh viên
                case 4:
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ");
            }

        } while (true);
    }


}
