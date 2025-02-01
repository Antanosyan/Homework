package homework_01_30;

import java.util.List;
import java.util.Objects;

public class Building {
    private int numberOfFloors;
    private int numberOfParking;
    private List<House> houses;

    public Building(int numberOfFloors, int numberOfParking, List<House> houses) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfParking = numberOfParking;
        this.houses = houses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return numberOfFloors == building.numberOfFloors &&
                numberOfParking == building.numberOfParking &&
                houses.equals(building.houses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfFloors, numberOfParking, houses);
    }

    @Override
    public String toString() {
        return "Building{" +
                "numberOfFloors=" + numberOfFloors +
                ", numberOfParking=" + numberOfParking +
                ", houses=" + houses +
                '}';
    }
}
