package homework_11_27;

public class ApartmentHeatingSystem extends HeatingSystem {

    public ApartmentHeatingSystem(double area, Boiler boiler, double insulation, double indoorTemp,int month) {
        super("Apartment", area, boiler, insulation * 0.7, indoorTemp,month);
    }
}
