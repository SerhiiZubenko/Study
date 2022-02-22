package task1.applaince;

import java.util.Arrays;
import java.util.Collections;

public class HomeAppliances {

    private String name;
    private String manufacturer;
    private int powerFull;
    private int operatingVoltage;
    private boolean turnOn;

    public HomeAppliances(String name, String manufacturer, int powerFull, int operatingVoltage, boolean turnOn) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.powerFull = powerFull;
        this.operatingVoltage = operatingVoltage;
        this.turnOn = turnOn;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPowerFull(int powerFull) {
        this.powerFull = powerFull;
    }

    public void setOperatingVoltage(int operatingVoltage) {
        this.operatingVoltage = operatingVoltage;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPowerFull() {
        return powerFull;
    }

    public int getOperatingVoltage() {
        return operatingVoltage;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public static int powerOfTheIncludedDevices(HomeAppliances[] arr) {

        int powerAllAppliances = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].turnOn == true) {
                powerAllAppliances += arr[i].getPowerFull();
            }
        }
        return powerAllAppliances;
    }

    public static Integer[] sortPowerFull(HomeAppliances[] appliances) {

         Integer[] arrayPowerFull = new Integer[appliances.length];
         for(int i = 0; i < appliances.length; i++){
             arrayPowerFull[i] = appliances[i].getPowerFull();
         }

         Arrays.sort(arrayPowerFull, Collections.reverseOrder());
         return arrayPowerFull;
    }

    public static void findOfAppliances(HomeAppliances[] appliances, int low, int top){

        for (HomeAppliances i : appliances) {
            if(i.getPowerFull() > low && i.getPowerFull() < top){
                System.out.println(i);
            }
        }

    }

    public String toString(){
        return name + " " + manufacturer + " " + powerFull + " " + operatingVoltage + " " + turnOn;
    }

}

