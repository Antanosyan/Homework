package class3.homework2;

public class Computer {
    private int id = 1;
    private static int nextId = 1;
    private int memory;
    private int ram;
    private static final int MAX_MEMORY = 2048;
    private static final int MAX_RAM = 64;

    public Computer(int memory, int ram) {
        setMemory(memory);
        setRam(ram);
        this.id = nextId++;
    }

    public Computer() {
        this(MAX_MEMORY, MAX_RAM);
    }

    public static Computer generateMegaComputer(int ram, int memory) {
        Computer megaComputer = new Computer();
        megaComputer.memory = memory;
        megaComputer.ram = ram;
        return megaComputer;
    }

    public void displaySpecs() {
        System.out.println("Computer ID: " + id);
        System.out.println("Memory: " + memory + " GB");
        System.out.println("RAM: " + ram + " GB");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Computer.nextId = nextId;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if (memory > MAX_MEMORY) {
            System.out.println("Memory exceeds the limit");
            System.exit(1);
        } else {
            this.memory = memory;
        }
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > MAX_RAM) {
            System.out.println("RAM exceeds the limit");
            System.exit(1);
        } else {
            this.ram = ram;
        }
    }
}
