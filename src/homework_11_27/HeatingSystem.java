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
    public void month() {
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}
