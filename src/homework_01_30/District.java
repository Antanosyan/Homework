package homework_01_30;

import java.util.List;
import java.util.Objects;

public class District {
    private List<Building> buildings;

    public District(List<Building> buildings) {
        this.buildings = buildings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District complex = (District) o;
        return buildings.equals(complex.buildings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildings);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "address='" + '\'' +
                ", buildings=" + buildings +
                '}';
    }
}
