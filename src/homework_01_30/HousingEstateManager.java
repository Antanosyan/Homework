package homework_01_30;

import java.util.*;

public class HousingEstateManager {
    public static void main(String[] args) {

        House house1 = new House(3, 76, true, 2);
        House house2 = new House(1, 35, false, 1);
        House house3 = new House(4, 96, true, 3);
        House house4 = new House(2, 66, true, 5);
        House house5 = new House(1, 56, false, 2);
        House house6 = new House(3, 106, true, 4);
        House house7 = new House(5, 156, false, 4);

        List<House> houseList1 = new ArrayList<>(Arrays.asList(house1, house2, house3));
        List<House> houseList2 = new ArrayList<>(Arrays.asList(house4, house3, house6));
        List<House> houseList3 = new ArrayList<>(Arrays.asList(house7, house1, house3));
        List<House> houseList4 = new ArrayList<>(Arrays.asList(house1, house1, house6));

        Building building1 = new Building(5, 45, houseList1);
        Building building2 = new Building(5, 0, houseList2);
        Building building3 = new Building(4, 17, houseList3);
        Building building4 = new Building(5, 5, houseList4);

        List<Building> buildingList1 = new ArrayList<>(Arrays.asList(building3, building4));
        List<Building> buildingList2 = new ArrayList<>(Arrays.asList(building1, building3, building4));
        List<Building> buildingList3 = new ArrayList<>(Arrays.asList(building2, building2, building4));
        List<Building> buildingList4 = new ArrayList<>(Arrays.asList(building2, building2, building4));
        List<Building> buildingList5 = new ArrayList<>(Arrays.asList(building3, building2, building4));

        District district1 = new District(buildingList1);
        District district2 = new District(buildingList2);
        District district3 = new District(buildingList3);
        District district4 = new District(buildingList4);
        District district5 = new District(buildingList5);

        Map<District, String> complexList = new HashMap<>();
        complexList.put(district1, "Baghramyan 1");
        complexList.put(district2, "Tumanyan 18");
        complexList.put(district3, "Komitas 17");

        String address = complexList.get(district5);

        try {
            if (address != null) {
                System.out.println("Address: " + address);
            } else {
                throw new ComplexNotFoundException("Complex not found!");
            }
        } catch (ComplexNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
