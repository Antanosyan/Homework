package interface_abstract1;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion " + getName() + " age of " + getAge() + "  roars");
    }

    @Override
    public void eat() {
        System.out.println("the Lion eats meat");
    }
}
