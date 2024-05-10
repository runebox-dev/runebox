package testclasses.inheritance;

public abstract class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal general sound");
    }

    public abstract void move();
}