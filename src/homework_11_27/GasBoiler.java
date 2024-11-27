package homework_11_27;

public class GasBoiler extends Boiler {
    private static final double HEATING_VALUE = 9.4;

    public GasBoiler(String brand, double waterVolume, double efficiency) {
        super(brand, "Gas", waterVolume, efficiency);
    }

    @Override
    public double calculateConsumption(double energyRequired) {
        // Formula: Gas consumption (m³) = Energy required / (Efficiency * Heating Value)
        // Energy required (kWh)
        //HEATING_VALUE  9.5–11.5 kWh/m³
        //Efficiency Example: 90% efficiency = 0.9
        return energyRequired / (getEfficiency() * HEATING_VALUE);
    }
}
