package animalTask;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo", 5);
        Animal elephant = new Elephant("Ella", 10);
        Animal parrot = new Parrot("Polly", 2);
        Animal eagle = new Eagle("Eddie", 4);

        lion.eat();
        lion.makeSound();
        lion.displayInformation();

        elephant.eat();
        elephant.makeSound();
        elephant.displayInformation();

        parrot.eat();
        parrot.makeSound();
        parrot.displayInformation();

        eagle.eat();
        eagle.makeSound();
        eagle.displayInformation();
    }
    }

