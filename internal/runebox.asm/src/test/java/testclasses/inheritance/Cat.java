package testclasses.inheritance;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        // Call the parent's method as well
        super.makeSound();
        System.out.println("Meow!");
    }

    @Override
    public void move() {
        System.out.println("Pounces gracefully");
    }
}