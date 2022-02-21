package com.epam.serhii_zubenko.java.lection3.task2;

import java.util.Scanner;

public class StringProcessing {

    public static void main(String[] args) {

        StringProcessing example = new StringProcessing();

        example.enterStrings();    // - task 2.2
    }

    public static void enterStrings(){

        System.out.println("Enter n - value of strings");
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();

        System.out.println("Enter strings");
        float temp =0.0F;
        Scanner sc = new Scanner(System.in);
        String[]  str = new String[n];

        for(int x = 0; x < n; x++) {
            str[x] = sc.nextLine();
            temp += str[x].length();
        }

        temp = temp/n;

        for (int s = 0; s < str.length; s++) {
            if (str[s].length() > temp) {
                System.out.println(str[s]);
            }
        }
    }
}
