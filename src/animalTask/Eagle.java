package animalTask;

public class Eagle extends Bird{

    public Eagle(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(this.name+" the eagle screeches.");
    }
    public void displayInformation() {
        System.out.println("This is an eagle named "+this.name+", aged "+this.age+".");
    }
}
