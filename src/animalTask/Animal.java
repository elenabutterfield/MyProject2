package animalTask;

public abstract class Animal implements AnimalBehavior {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayInformation();

    public void eat() {
        System.out.println(this.name+" is eating.");
    }
    public void sleep() {
        System.out.println( this.name+" is sleeping.");
    }
    public void makeSound() {
        System.out.println(this.name+ " is making a sound.");
    }
}

