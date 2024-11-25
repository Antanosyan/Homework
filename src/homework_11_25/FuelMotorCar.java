package homework_11_25;

public class FuelMotorCar extends Car {
    private boolean isGasOn;

    public FuelMotorCar(String brand, int releaseYear, boolean isGasOn) {
        super(brand, releaseYear);
        this.isGasOn = isGasOn;
    }

    @Override
    public void startDriving() {
        System.out.println(isGasOn ? "Driving fuelMotorCar in gas mode..." :
                "Driving fuelMotorCar in diesel mode...");
    }

    @Override
    public void switchToGas() {
        this.isGasOn = !this.isGasOn;
        System.out.println("Gas mode is switched " + (this.isGasOn ? "ON" : "OFF"));
    }
}