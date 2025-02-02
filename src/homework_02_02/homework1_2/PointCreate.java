package homework_02_02.homework1_2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PointCreate {
    public static void main(String[] args) {
        Point point1 = new Point(2, 5, 5, "Orange", "Point1");
        Point point2 = new Point(7, 0, 6, "Red", "Point2");
        Point point3 = new Point(3, 8, 12, "Green", "Point3");
        Point point4 = new Point(4, 3, 3, "Red", "Point4");

        Point point5 = new Point(3, 6, 5, "White", "Point5");
        Point point6 = new Point(3, 6, 5, "White", "Point6");

        Map<Point, String> mapPoints = new HashMap<>();
        System.out.println("Map list");
        mapPoints.put(point1, "Vahe");
        mapPoints.put(point2, "David");
        mapPoints.put(point3, "Artak");
        mapPoints.put(point4, "Armine");
        mapPoints.put(point5, "Vahe");
        mapPoints.put(point6, "Vahe");

        for (Map.Entry<Point,String> points : mapPoints.entrySet()){
            System.out.println(points);
        }
        System.out.println("----------------------");
        System.out.println("TreeMap list");
        Map<Point, String> treeMapPoints = new TreeMap<>(mapPoints);
        for (Map.Entry<Point,String> points : treeMapPoints.entrySet()){
            System.out.println(points);
        }
        System.out.println("----------------------");

        System.out.println("Swapped mapList");
        Map<String,Point> swappedMap1 = Point.swapeMap(mapPoints);
        for (Map.Entry<String,Point> el : swappedMap1.entrySet()){
            System.out.println(el);
        }
        System.out.println("-----------------");

        System.out.println("Swapped treeMap");
        Map<String,Point> swappedMap2 = Point.swapeMap(treeMapPoints);
        for (Map.Entry<String,Point> el : swappedMap2.entrySet()){
            System.out.println(el);
        }
    }
}
