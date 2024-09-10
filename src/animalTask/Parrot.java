package animalTask;

public class Parrot extends Bird{

    public Parrot(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(this.name+" the parrot squawks.");
    }
    public void displayInformation() {
        System.out.println("This is a parrot named "+this.name+", aged "+this.age+".");
    }
}
