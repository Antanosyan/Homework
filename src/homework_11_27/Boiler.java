package homework_11_27;

public abstract class Boiler {
    private String brand;
    private String type;
    private double waterVolume; // Water volume in liters
    private double efficiency; // Efficiency as a decimal (e.g., 0.9 for 90%)

    public Boiler(String brand, String type, double waterVolume, double efficiency) {
        this.brand = brand;
        this.type = type;
        this.waterVolume = waterVolume;
        this.efficiency = efficiency;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public abstract double calculateConsumption(double energyRequired);

   public String showInfo(){
       return "Boiler: Brand = " + brand + ", Type = " + type + ", Water Volume = " + waterVolume + "L, Efficiency="
               + (efficiency * 100) + " %";
   }
}
