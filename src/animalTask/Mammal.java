package animalTask;

public abstract class Mammal extends Animal{
    public Mammal(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println(this.name+" the mammal is eating.");
    }
    public void makeSound() {
        System.out.println(this.name+" the mammal is making a sound.");
    }
}
