package Lesson2;

public class HMPar5 {
    public static void main(String[] args) {
        paragraph5(200);
        System.out.println(paragraph5(200));
    }

    private static boolean paragraph5(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0){
                return false;
            } else {
                return true;
            }
        }
        return true;
        }
}
