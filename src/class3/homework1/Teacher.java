package class3.homework1;

public class Teacher {
    // Static variables
    private static double K;
    private static double minBaseSalary;
    private static double minSalary;
    // Instance variables
    private String name;
    private String surName;
    private double W;
    private double salary;

    public static void setBaseParameters(double k, double MIN_SALARY) {
        if (k >= 1) {
            K = k;
        } else if (k < 1) {
            System.exit(1);
        }
        minSalary = MIN_SALARY;
        minBaseSalary = k * minSalary;
    }

    public Teacher(String name, String surName, double W) {
        this.name = name;
        this.surName = surName;
        if (W < 1) {
            System.exit(1);
        } else {
            this.W = W;
        }
        this.salary = this.W * minBaseSalary;
    }

    // display salary details
    public void displaySalary() {
        System.out.println(name + " " + surName + " W : " + W);
        System.out.println(name + " " + surName + "'s salary: " + salary);
    }
}
