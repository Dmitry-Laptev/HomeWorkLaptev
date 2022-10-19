package Lesson6;

public class Animal {
        String name;
        int swimDist;
        int runDist;
        public Animal() {
        }

    public Animal(String name) {
            this.name = name;
        }
        public void animalInfo() {
            System.out.println("Животное: " + name);
        }
        public void run(String name, int runDist) {
            System.out.println(name + " пробежал " + runDist);
        }
        public void swim(String name, int swimDist) {
            System.out.println(name + " проплыл " + swimDist);
        }

}
