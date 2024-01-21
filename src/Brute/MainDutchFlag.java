package Brute;

import java.util.ArrayList;

public class MainDutchFlag {

    public static void main(String[] args) {

        ArrayList<Character> balls = new ArrayList<>();

        balls.add('G');
        balls.add('B');
        balls.add('G');
        balls.add('G');
        balls.add('R');
        balls.add('B');
        balls.add('R');
        balls.add('G');

        DutchNationalFlag flag = new DutchNationalFlag();

        System.out.println("Here is the unsorted balls list: ");
        flag.displayBalls(balls);
        System.out.println("---------------------------------");

        flag.dutch_flag_sort(balls);

        System.out.println("---------------------------------");
        System.out.println("Here is the sorted balls list: ");
        flag.displayBalls(balls);

    }

}