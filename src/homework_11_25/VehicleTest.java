package homework_11_25;

public class VehicleTest {
    public static void main(String[] args) {
        Car fuelMotorCar = new FuelMotorCar("BMW", 1987, false);
        Vehicle motorCycle = new MotorCycle("Honda", 1990);
        Car dieselMotorCar = new DieselMotorCar("Ford Transit", 2000, false);
        Car hybridElectricCar = new HybridElectricCar("Toyota", 2023, true);

        Vehicle[] vehicles = {fuelMotorCar, motorCycle, dieselMotorCar, hybridElectricCar};

        for (Vehicle vehicle : vehicles) {
            vehicle.startDriving();
            vehicle.showBrandInfo();
            if (vehicle instanceof Car) {
                ((Car) vehicle).switchToGas();
                ((Car) vehicle).switchToGas();
            }
            System.out.println("------------");
        }

    }
}
