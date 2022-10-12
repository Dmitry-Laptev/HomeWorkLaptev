package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '.';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    public static final String HEADER_FIRST_SYMBOL = "@";
    public static final String SPACE_MAP_SYMBOL = " ";

    private static final char[][] MAP = new char[SIZE][SIZE];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount = 0;

    private static int stringNumber;
    private static int columnNumber;


    public static void main(String[] args) {
        turnGame();
    }

    private static void turnGame() {
        initMap();
        printMAP();
        playGame();
    }


    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMAP() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printBodyMap() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i + 1 + SPACE_MAP_SYMBOL);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(String i) {
        System.out.print(i);
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i + 1 + SPACE_MAP_SYMBOL);
        }
    }

    private static void playGame() {
        printMAP();
        while (true) {
            humanTurn();        // human turn
            printMAP();         // print play field

            if (checkEnd(DOT_HUMAN)) {
                break;
            }                   // end game check

            aiTurn();// ai turn
            printMAP();         // print play field

            if (checkEnd(DOT_AI)) {
                break;
            }                   // end game check
        }
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {     // win
            if(symbol == DOT_HUMAN) {
                System.out.println("YOU WIN!");
            } else {
                System.out.println("COMPUTER WINS!");
            }
            return true;
        }
        if (checkDraw()) {          // draw
            System.out.println("DRAW");
            return true;
        }
    return false;
    }

    private static boolean checkDraw() {
        return turnsCount >= SIZE * SIZE;
    }

    /*if(MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) return true;
        if(MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) return true;
        if(MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) return true;
        if(MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) return true;
        if(MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) return true;
        if(MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) return true;
        if(MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) return true;
        if(MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) return true;*/

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++)
            if ((MAP[i][0] == symbol && MAP[i][1] == symbol && MAP[i][2] == symbol) ||
                    (MAP[0][i] == symbol && MAP[1][i] == symbol && MAP[2][i] == symbol)) {
                return true;
            }
        if ((MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) ||
                (MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol)) {
            return true;
        } return false;
    }




    private static void aiTurn() {
        System.out.println("\nAI turn");


        do {
            stringNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellFree(stringNumber, columnNumber));

        MAP[stringNumber][columnNumber] = DOT_AI;

        turnsCount ++;
    }

    private static void humanTurn() {
        System.out.println("\nHuman turn");
        int stringNumber;
        int columnNumber;

        System.out.print("Enter string number ");
        stringNumber = in.nextInt() - 1;
        System.out.print("Enter column number ");
        columnNumber = in.nextInt() - 1;


        while (true) {
            if (isCellFree(stringNumber, columnNumber)) {
                break;
            }
            System.out.printf("Error! Cell %s:%s already used%n", stringNumber + 1, columnNumber + 1);
        }

        MAP[stringNumber][columnNumber] = DOT_HUMAN;

        turnsCount ++;
    }

    private static boolean isCellFree(int stringNumber, int columnNumber) {
        return MAP[stringNumber][columnNumber] == DOT_EMPTY;
    }
}
