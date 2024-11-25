package homework_11_25;

public class MotorCycle extends Vehicle {
    public MotorCycle(String brand, int releaseYear) {
        super(brand, releaseYear);
    }

    @Override
    public void startDriving() {

        System.out.println("Driving motorcycle. No gas mode available for motorcycle.");
    }
}
