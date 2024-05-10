package testclasses.inheritance;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public void move() {
        System.out.println("Run around playfully");
    }
}