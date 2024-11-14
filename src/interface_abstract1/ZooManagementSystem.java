package interface_abstract1;

public class ZooManagementSystem {
    public static void main(String[] args) {
        Animal[] zoo = {new Lion("Lion1", 14),
                new Elephant("Elephant1", 4),
                new Monkey("Monkey1", 1),
                new Lion("Loin2", 7),
                new Elephant("Elephant2", 5)
        };
        for (Animal animal : zoo) {
            animal.makeSound();
            animal.eat();

            if (animal instanceof TrickPerformer) {
                ((TrickPerformer) animal).performTrick();
            }
        }
    }
}
