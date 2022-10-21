package Lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Kitty");
        Plate plate = new Plate(30);
        Cat cat1 = new Cat("Pussy");
        Cat cat2 = new Cat("Pinky");
        Cat cat3 = new Cat("Browny");
        Cat[] catArray = {cat0, cat1, cat2, cat3};
        
        plate.printInfo();

        for (Cat cat : catArray) {
            do {
                cat.eat(plate);
            } while (cat.setFull());
        }
        plate.printInfo();
        plate.addFood();


        plate.printInfo();

    }
}
