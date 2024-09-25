package functionOverloading;

public class CalculateIncome {
    public static void main(String[] args) {
        System.out.println(calculateIncomeTax(2000));
        System.out.println(calculateIncomeTax(2000, 0.30));
        System.out.println(calculateIncomeTax(2000, true));

    }

    static double calculateIncomeTax(double salary) {
        double defaultTaxRate = 0.20;
        return salary * defaultTaxRate;
    }

    static double calculateIncomeTax(double salary, double customTaxRate) {
        return salary * customTaxRate;
    }

    static double calculateIncomeTax(double salary, boolean isIT) {
        double taxRate = isIT ? 0.10 : 0.20;
        return salary * taxRate;
    }
}
