package homework_11_27;

public class BoilerDemo {
    public static void main(String[] args) {
        Boiler gasBoiler = new GasBoiler("Baxi", 170, 0.9); // 90% efficiency
        Boiler electricBoiler = new ElectricBoiler("Squirrel", 250, 0.68); // 68% efficiency

        HeatingSystem apartmentSystem1 = new ApartmentHeatingSystem(130, gasBoiler, 0.5, 22,1); // U = 0.5 W/m²·
        HeatingSystem apartmentSystem2 = new ApartmentHeatingSystem(110, electricBoiler, 0.3, 20,5);
        HeatingSystem privateHouseSystem1 = new PrivateHouseHeatingSystem(200, electricBoiler, 0.4, 19,7);
        HeatingSystem privateHouseSystem2 = new PrivateHouseHeatingSystem(200, gasBoiler, 0.8, 29,11);

        HeatingSystem[] heatingSystems = {
                apartmentSystem1,
                privateHouseSystem1,
                apartmentSystem2,
                privateHouseSystem2
        };
        for (HeatingSystem heatingSystem : heatingSystems) {
            heatingSystem.month();
            System.out.println(heatingSystem.showInfo());
            System.out.println(heatingSystem.getBoiler() instanceof GasBoiler ?
                    "Gas consumption: " + heatingSystem.calculateConsumption() :
                    "Electricity consumption: " + heatingSystem.calculateConsumption());
            System.out.println("--------------------");
        }
    }
}

