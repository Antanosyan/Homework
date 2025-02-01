package homework_01_30;

import java.util.Objects;

public class House {
    int roomCount;
    int area;
    boolean hasBalcony;
    int floor;

    public House(int rooms, int area, boolean hasBalcony, int floor) {
        this.roomCount = rooms;
        this.area = area;
        this.hasBalcony = hasBalcony;
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return roomCount == house.roomCount && area == house.area && hasBalcony == house.hasBalcony && floor == house.floor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomCount, area, hasBalcony, floor);
    }

    @Override
    public String toString() {
        return "House{' rooms=" + roomCount + ", area=" + area + ", hasBalcony=" + hasBalcony + ", floor=" + floor + "}";
    }
}
