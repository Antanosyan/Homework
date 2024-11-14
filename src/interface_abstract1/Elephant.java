package interface_abstract1;

public class Elephant extends Animal implements TrickPerformer {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant " + getName() + " age of " + getAge() + " trumpets!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Elephant eats grass.");
    }

    public void performTrick() {
        System.out.println(getName() + " the Elephant performs a balancing trick!");
    }
}
