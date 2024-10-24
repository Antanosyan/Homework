package class3.homework2;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        Computer comp2 = new Computer();

        Computer comp3 = new Computer(512, 32);
        Computer comp4 = new Computer(2000, 64);

        Computer mrgaComputer = Computer.generateMegaComputer(5000, 512);

        System.out.println("Computer 1:");
        comp1.displaySpecs();
        System.out.println("--------");
        System.out.println("Computer 2:");

        comp2.displaySpecs();
        System.out.println("---------");
        System.out.println("Computer 3:");

        comp3.displaySpecs();
        System.out.println("---------");
        System.out.println("Computer 4:");

        comp4.displaySpecs();
        System.out.println("----------");
        System.out.println("Mega Computer:");
        mrgaComputer.displaySpecs();
    }
}
