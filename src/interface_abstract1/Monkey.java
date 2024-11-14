package interface_abstract1;

public class Monkey extends Animal implements TrickPerformer {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey " + getName() + " age of " + getAge() + " screeches!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Monkey eats bananas.");
    }

    public void performTrick() {
        System.out.println(getName() + " the Monkey swings on a branch!");
    }
}
