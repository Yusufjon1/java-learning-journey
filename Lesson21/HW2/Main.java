package Lesson21.HW2;

public class Main {
    static void main(String[] args) {
        AnimalHouse<Dog> dogHouse = new AnimalHouse<>();
        dogHouse.setAnimal(new Dog("Rexy"));
        Dog dog = dogHouse.getAnimal();
        dog.makeSound();

        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
        catHouse.setAnimal(new Cat("Johny"));
        Cat cat = catHouse.getAnimal();
        cat.makeSound();

        AnimalHouse<Horse> horseHouse = new AnimalHouse<>();
        horseHouse.setAnimal(new Horse("claudia"));
        Horse horse = horseHouse.getAnimal();
        horse.makeSound();

        AnimalHouse<Sheep> sheepHouse = new AnimalHouse<>();
        sheepHouse.setAnimal(new Sheep("Mike"));
        Sheep sheep = sheepHouse.getAnimal();
        sheep.makeSound();
     }
}
