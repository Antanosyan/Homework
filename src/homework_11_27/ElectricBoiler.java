package homework_11_27;

public class ElectricBoiler extends Boiler {
    public ElectricBoiler(String brand, double waterVolume, double efficiency) {
        super(brand, "Electric", waterVolume, efficiency);
    }

    @Override
    public double calculateConsumption(double energyRequired) {
        // Formula: Electricity consumption (kWh) = Energy required (kWh) / Efficiency
        return energyRequired / getEfficiency();
    }
}
