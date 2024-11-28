package homework_11_27;

public class PrivateHouseHeatingSystem extends HeatingSystem {
    private static final double SURFACE_MULTIPLIER = 1.2; // coefficient for higher exposed surface area

    public PrivateHouseHeatingSystem(double area, Boiler boiler, double insulation, double indoorTemp,int month) {
        super("Private House", area * SURFACE_MULTIPLIER, boiler, insulation, indoorTemp,month);
    }
}
