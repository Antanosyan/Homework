package homework_11_27;

public abstract class HeatingSystem {
    private String houseType; // Apartment or Private House
    private double area; // Area in m²
    private Boiler boiler; // Boiler used in the system
    private double insulation; // Heat transfer coefficient (U) in W/m²·K
    private final double OutDoorAvgMonthlyTemp = 11; // Average outdoor temperature
    private double indoorTemp;

    public HeatingSystem(String houseType, double area, Boiler boiler, double insulation, double indoorTemp) {
        this.houseType = houseType;
        this.area = area;
        this.boiler = boiler;
        this.insulation = insulation;
        this.indoorTemp = indoorTemp;

    }

    public double calculateEnergy() {
        // Formula: Q = U * A * (T_indoor - T_outdoor) / 1000
        return insulation * area * (indoorTemp - OutDoorAvgMonthlyTemp) / 1000.0;
    }

    public double calculateConsumption() {
        return boiler.calculateConsumption(calculateEnergy());
    }

    public String showInfo(){
        return "HeatingSystem : House Type = " + houseType + ", Area = " + area + " sqm " + "\n" + boiler.showInfo();
    }

    public Boiler getBoiler() {
        return boiler;
    }
}
