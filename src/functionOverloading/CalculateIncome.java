package functionOverloading;

public class CalculateIncome {
    public static void main(String[] args) {
        System.out.println(calculateIncomeTax(2000));
        System.out.println(calculateIncomeTax(2000, 30));
        System.out.println(calculateIncomeTax(2000, true));
    }
    // income tax with a custom tax rate
    static double calculateIncomeTax(double grossSalary, double customTaxRate) {
        return grossSalary * customTaxRate / 100;
    }
    // income tax with default tax rate 20%
    static double calculateIncomeTax(double grossSalary) {
        return calculateIncomeTax(grossSalary, 20.0);
    }
    // 10% for IT, default 20%
    public static double calculateIncomeTax(double grossSalary, boolean isITEmployee) {
        if (isITEmployee) {
            return calculateIncomeTax(grossSalary, 10);  // Reusing the second method for IT employees (10%)
        } else {
            return calculateIncomeTax(grossSalary);  // Reusing the first method (default 20%)
        }
    }
}
