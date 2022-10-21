package Lesson7;

import java.util.Scanner;

public class Plate {
    private int foodCount;

    Scanner in = new Scanner(System.in);

    public Plate(int foodCount) {

        this.foodCount = foodCount;
    }

    public void printInfo() {

            System.out.printf("В миске осталось %s корма%n", foodCount);

    }

    public int getFoodCount() {
        return foodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
            foodCount -= catEatFoodCount;
            System.out.println("Объем миски уменьшился на " + catEatFoodCount);

    }

    public void addFood() {
        System.out.println("Добавить еды?");
        foodCount = foodCount + in.nextInt();
    }
}
