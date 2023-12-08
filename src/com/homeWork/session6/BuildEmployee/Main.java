package com.homeWork.session6.BuildEmployee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("MS01","Nguyen Van A",16,true,1.6);
        System.out.print("社員の情報：");employee1.displayData();
        System.out.println(" 給与："+employee1.calSalary());

        Employee employee2 = new Employee("MS02","Nguyen Van B",20,true,2.0);
        System.out.print("社員の情報：");employee2.displayData();
        System.out.println(" 給与："+employee2.calSalary());

        Employee employee3 = new Employee("MS03","Hoang Thi C",18,false,1.8);
        System.out.print("社員の情報：");employee3.displayData();
        System.out.println(" 給与："+employee3.calSalary());

        Employee employee4 = new Employee("MS04","Le Hoang D",22,false,3.0);
        System.out.print("社員の情報：");employee4.displayData();
        System.out.println(" 給与："+employee4.calSalary());

        Employee employee5 = new Employee("MS05","Tran Hung E",28,true,4.5);
        System.out.print("社員の情報：");employee5.displayData();
        System.out.println(" 給与："+employee5.calSalary());
    }
}
