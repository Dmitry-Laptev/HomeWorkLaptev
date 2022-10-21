package Lesson7;

import java.util.Random;

public class Cat {
    private String name;
    boolean full;

    public Cat(String name){

        this.name = name;
    }

    public void eat(Plate plate) {
        int catEatFoodCount = new Random().nextInt(4,8);
        if (catEatFoodCount < plate.getFoodCount()) {
            plate.decreaseFood(catEatFoodCount);
            System.out.printf("Котик %s съел %s корма%n", name, catEatFoodCount);
            full = true;
        } else System.out.println("В миске не хватает корма");
    }

    public boolean setFull() {
        if (full) {
            System.out.println("Котик сыт");
        }
        return false;
    }
}
