package com.epam.serhii_zubenko.java.lection3.task3;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.sum();
        calculator.subtraction();
        calculator.multiplication();
        calculator.dividing();
    }

    public static void sum (){

        System.out.println("Enter two integer values");
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        int b = value.nextInt();
        System.out.println("Result =" + (a + b) );
    }

    public static void subtraction (){

        System.out.println("Enter two integer values");
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        int b = value.nextInt();
        System.out.println("Result =" + (a - b) );
    }

    public static void multiplication (){

        System.out.println("Enter two integer values");
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        int b = value.nextInt();
        System.out.println("Result =" + (a * b) );
    }

    public static void dividing (){

        System.out.println("Enter two integer values");
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        int b = value.nextInt();
        System.out.println("Result =" + (a / b) );
    }
}
