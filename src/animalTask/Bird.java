package animalTask;

public abstract class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(this.name+" the bird is eating.");
    }
    public void makeSound() {
        System.out.println(this.name+" the bird is making a sound.");
    }
}

