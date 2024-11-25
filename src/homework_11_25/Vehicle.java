package homework_11_25;

public abstract class Vehicle {
    private String brand;
    private int releaseYear;

    public Vehicle(String brand, int releaseYear) {
        this.brand = brand;
        this.releaseYear = releaseYear;
    }

    public void showBrandInfo() {
        System.out.println("Vehicle brand is " + brand + ", release year is " + releaseYear);
    }

    public abstract void startDriving();
}
