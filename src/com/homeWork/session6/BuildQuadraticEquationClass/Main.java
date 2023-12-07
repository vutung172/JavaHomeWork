package com.homeWork.session6.BuildQuadraticEquationClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("===Quadratic Equation===");
            System.out.println("1. (ax^2 + bx + c = 0) ");
            System.out.println("2. Exit ");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1:
                    System.out.println("Please enter a: ");
                    double a = Double.parseDouble(sc.nextLine());
                    System.out.println("Please enter b: ");
                    double b = Double.parseDouble(sc.nextLine());
                    System.out.println("Please enter c: ");
                    double c = Double.parseDouble(sc.nextLine());
                    QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
                    if (a != 0) {
                        if (quadraticEquation.getDiscriminant() >= 0) {
                            System.out.println("First root is: " + quadraticEquation.getRoot1());
                            System.out.println("Second root is: "+ quadraticEquation.getRoot2());
                        } else if (quadraticEquation.getDiscriminant() == 0) {
                            System.out.println("Root is: " + quadraticEquation.getRoot1());
                        } else {
                            System.out.println("The equation has no roots");
                        }
                    } else {
                        System.out.println("Math error");
                    }
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your choice is not available");

            }

        } while (true);

    }

}
