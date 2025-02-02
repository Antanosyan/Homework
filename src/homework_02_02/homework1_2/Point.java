package homework_02_02.homework1_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Point implements Comparable<Point>{
    private int x, y, z;
    private String nameOfPoint;
    private String color;

    public Point(int x, int y, int z, String color, String nameOfPoint) {
        this.x = x;
        this.z = z;
        this.y = y;
        this.color = color;
        this.nameOfPoint = nameOfPoint;
    }
    public static Map<String,Point> swapeMap(Map<Point,String> original){
        Map<String,Point> swapedMap = new HashMap<>();
        for(Map.Entry<Point,String> point : original.entrySet()){
            swapedMap.put(point.getValue(),point.getKey());
        }
        return swapedMap;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point3D = (Point) o;
        return Double.compare(x, point3D.x) == 0 && Double.compare(y, point3D.y) == 0 && Double.compare(z, point3D.z) == 0 && Objects.equals(nameOfPoint, point3D.nameOfPoint) && Objects.equals(color, point3D.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, nameOfPoint, color);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", name='" + nameOfPoint + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Point other) {
        if (x != other.x) return x - other.x;
        if (y != other.y) return y - other.y;
        if (z != other.z) return z - other.z;
        return this.color.compareTo(other.color);
    }
}
