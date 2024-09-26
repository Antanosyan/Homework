package functionOverloading;

public class ConvertTemperature {
    public static void main(String[] args) {
        System.out.println("celsius to fahrenheit  :" + convertTemperature(0.0) + " F");
        System.out.println("fahrenheit to celsius  :" + convertTemperature(0) + " C");
    }

    static double convertTemperature(double celsius) {
        if (celsius < -273.15) {
            System.out.println("Temperature less than absolute zero is impossible");
            System.exit(1);
        }
        return celsius * 9 / 5 + 32;
    }

    static double convertTemperature(float fahrenheit) {
        if (fahrenheit < -459.67) {
            System.out.println("Temperature less than absolute zero is impossible");
            System.exit(1);
        }
        return (fahrenheit - 32) * 5 / 9;
    }
}
