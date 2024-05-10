package testclasses.inheritance;

public class Zookeeper implements AnimalCare {

    private final String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    @Override
    public void feed(Animal animal) {
        System.out.println("Feeding " + animal.getName());
    }

    @Override
    public void clean(Animal animal) {
        System.out.println("Cleaning after " + animal.getName());
    }
}