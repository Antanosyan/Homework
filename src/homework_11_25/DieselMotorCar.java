package homework_11_25;

public class DieselMotorCar extends Car implements GasSwitchable {
    private boolean isGasOn;

    public DieselMotorCar(String brand, int releaseYear, boolean isGasOn) {
        super(brand, releaseYear);
        this.isGasOn = isGasOn;
    }

    @Override
    public void startDriving() {
        System.out.println(isGasOn ? "Driving diesel car in gas mode... " :
                "Driving diesel car in diesel mode...");
    }

    @Override
    public void switchToGas() {
        this.isGasOn = !this.isGasOn;
        System.out.println("Gas mode is switched " + (this.isGasOn ? "ON" : "OFF"));
    }
}
