package classes1;

public class Home {
    public double kitchen;
    public double bedroom;
    public double diningRoom;
    public double bathroom;

    public Home(double kitchen, double bedroom, double diningRoom, double bathroom) {
        if (kitchen <= 0 || bedroom <= 0 || diningRoom <= 0 || bathroom <= 0) {
            System.out.println("negative dimension");
            System.exit(1);
        }
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.diningRoom = diningRoom;
        this.bathroom = bathroom;
    }

    public Home(double kitchen, double bedroom, double diningRoom) {
        if (kitchen <= 0 || bedroom <= 0 || diningRoom <= 0) {
            System.out.println("negative dimension");
            System.exit(1);
        }
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.diningRoom = diningRoom;
        this.bathroom = 14.0;
    }

    public void roomAreaInfo() {
        System.out.println("kitchen: " + kitchen + " sqm");
        System.out.println("bedroom: " + bedroom + " sqm");
        System.out.println("dining room: " + diningRoom + " sqm");
        System.out.println("bathroom: " + bathroom + " sqm");
    }

    public static void main(String[] args) {
        Home home1 = new Home(14, 17, 2, 9);
        home1.roomAreaInfo();

        Home home2 = new Home(7, 8, 9);
        home2.roomAreaInfo();

        Home home3 = new Home(-9, 8, 9);
        home3.roomAreaInfo();

        Home home4 = new Home(-7, 8, 7, 0);
        home4.roomAreaInfo();
    }
}


