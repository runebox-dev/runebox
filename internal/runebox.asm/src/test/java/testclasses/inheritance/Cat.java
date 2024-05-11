package testclasses.inheritance;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        // Call the parent's method as well
        super.makeSound();
        System.out.println("Meow!");
    }

    public void move() {
        System.out.println("Pounces gracefully");
    }
}