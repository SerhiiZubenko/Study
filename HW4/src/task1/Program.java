package task1;


import task1.applaince.BaseAppliances;
import task1.applaince.HouseAppliances;
import task1.applaince.StreetAppliances;

import java.util.Arrays;

import static task1.applaince.BaseAppliances.powerOfTheIncludedDevices;


public class Program {

    public static void main(String[] args) {

        BaseAppliances[] arr = new BaseAppliances[4];
        arr[0] = new HouseAppliances("Phone",
                "Lenovo", 50, 220, true, "A+");
        arr[1] = new StreetAppliances("Lighting",
                "Max", 500, 220, true, "IP68");
        arr[2] = new HouseAppliances("Microwave",
                "Electrolux", 1500, 220, false, "AAA");
        arr[3] = new StreetAppliances("Lawn mower ",
                "Huswarna", 1200, 220, true, "IP68");

        System.out.println("Result =" + powerOfTheIncludedDevices(arr));

        Integer[] sortArr = BaseAppliances.sortPowerFull(arr);

        for ( Integer i : sortArr) {
            System.out.println(i);
        }

        BaseAppliances.findOfAppliances(arr, 0, 1600);

    }
}