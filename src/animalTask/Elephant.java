package animalTask;

public class Elephant extends Mammal{

    public Elephant(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(this.name+" the elephant trumpets.");
    }
    public void displayInformation() {
        System.out.println("This is an elephant named "+this.name+", aged "+this.age+".");
    }
}

