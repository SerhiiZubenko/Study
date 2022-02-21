package com.epam.serhii_zubenko.java.lection3.task1;

public class WorkWithArray {

    public static void main(String[] args) {

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }

        WorkWithArray.changeOfElements(arr);   // - task 1.1

        WorkWithArray.workOfElements(arr);     // - task 1.2

        WorkWithArray.changeNegativeElements(arr);  // - task 1.3


    }

    public static void changeOfElements (int[] mas){

        int tempMin = mas[0];
        int numMin = 0;
        int tempMax = mas[0];
        int numMax =0;

        for(int i = 1; i < mas.length; i++){

            if(mas[i] < tempMin && mas[i]<0 ){
                tempMin = mas[i];
                numMin = i;
            }
        }

        for(int i = 1; i < mas.length; i++){

            if(mas[i] > tempMax && mas[i] > 0 ){
                tempMax = mas[i];
                numMax = i;
            }
        }
        System.out.println("\n" + tempMin +", " + tempMax);

        int temp = mas[numMin];
        mas[numMin] = mas[numMax];
        mas[numMax] = temp;

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }

    }

    public static void workOfElements(int[] mas) {

        int count = 0;

        for (int i = 0; i < mas.length; i += 2) {
            count = count + mas[i];
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
        System.out.print("\n" + "result = " + count + "\n");
    }

    public static void changeNegativeElements(int[] mas){
        for (int i =0; i < mas.length; i++){
            if(mas[i]<0){
                mas[i] = 0;
            }
        }
        for (int i : mas){
            System.out.print(i+ ", ");
        }
    }



}