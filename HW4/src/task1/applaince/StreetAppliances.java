package task1.applaince;

import task1.Street;

public class StreetAppliances extends BaseAppliances implements Street {

    private String levelOfProtection;

    public void setLevelOfProtection(String levelOfProtection) {
        this.levelOfProtection = levelOfProtection;
    }

    public String getLevelOfProtection() {
        return levelOfProtection;
    }

    public StreetAppliances(String name, String manufacturer,
                            int powerFull, int operatingVoltage, boolean turnOn, String levelOfProtection) {
        super(name, manufacturer, powerFull, operatingVoltage, turnOn);
        this.levelOfProtection = levelOfProtection;
    }

    @Override
    public void workOutSideHouse() {
        System.out.println("Working outside the house");
    }


}
