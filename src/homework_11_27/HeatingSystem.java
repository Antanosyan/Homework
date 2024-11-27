package homework_11_27;

public abstract class HeatingSystem {
    private String houseType; // Apartment or Private House
    private double area; // Area in m²
    private Boiler boiler; // Boiler used in the system
    private double insulation; // Heat transfer coefficient (U) in W/m²·K
    private static final double[] TEMPERATURES = {-12, -8, -5, 0, 5, 20, 25, 20, 15, 7, 5, -1}; // Average temperatures by month
    private double indoorTemp;
    private int month;

    public HeatingSystem(String houseType, double area, Boiler boiler, double insulation, double indoorTemp,int month) {
        this.houseType = houseType;
        this.area = area;
        this.boiler = boiler;
        this.insulation = insulation;
        this.indoorTemp = indoorTemp;
        this.month = month;
    }

    public double calculateEnergy() {
        // Formula: Q = U * A * (T_indoor - T_outdoor) / 1000
        return insulation * area * (indoorTemp - TEMPERATURES[month - 1]) / 1000.0;
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
