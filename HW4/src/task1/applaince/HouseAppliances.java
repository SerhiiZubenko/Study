package task1.applaince;

import task1.House;

public class HouseAppliances extends HomeAppliances implements House {

    private String energyEfficiencyLevel;

    public void setEnergyEfficiencyLevel(String energyEfficiencyLevel) {
        this.energyEfficiencyLevel = energyEfficiencyLevel;
    }

    public String getEnergyEfficiencyLevel() {
        return energyEfficiencyLevel;
    }

    public HouseAppliances(String name, String manufacturer,
                           int powerFull, int operatingVoltage, boolean turnOn, String energyEfficiencyLevel) {
        super(name, manufacturer, powerFull, operatingVoltage, turnOn);
        this.energyEfficiencyLevel = energyEfficiencyLevel;
    }

    @Override
    public void wornAtKitchen() {
        System.out.println("Working at a kitchen");
    }


}
