package homework_11_25;

public class HybridElectricCar extends Car implements GasSwitchable {
    private boolean isGasOn;

    public HybridElectricCar(String brand, int releaseYear, boolean isGasOn) {
        super(brand, releaseYear);
        this.isGasOn = isGasOn;
    }

    @Override
    public void startDriving() {
        System.out.println(isGasOn ? "Driving hybrid electric car in gas mode..." :
                "Driving hybrid electric car in electric mode...");
    }

    @Override
    public void switchToGas() {
        this.isGasOn = !this.isGasOn;
        System.out.println("Gas mode is switched " + (this.isGasOn ? "ON" : "OFF"));
    }
}
