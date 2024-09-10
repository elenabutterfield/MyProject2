package animalTask;

public class Lion extends Mammal {

    public Lion(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(this.name+" the lion roars.");
    }
    public void displayInformation() {
        System.out.println("This is a lion named "+this.name+ ", aged "+this.age+".");
    }
}
