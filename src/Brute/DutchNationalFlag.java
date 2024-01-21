package Brute;

import java.util.ArrayList;

public class DutchNationalFlag {

    ArrayList<Character> dutch_flag_sort(ArrayList<Character> balls) {

        int redPtr = 0;
        int bluePtr = balls.size() - 1;
        int currentPtr = 0;
        // {
        // "balls": ["Gtemp", "B", "G", "G", "R", "B", "R", "G"]
        // }
        while (currentPtr <= bluePtr) {
            char currentBall = balls.get(currentPtr);
            System.out.println("CurrentPTR is: " + currentPtr);

            if (currentBall == 'R') {
                // Swap red ball to the left
                swap(balls, redPtr, currentPtr);
                redPtr++;
                currentPtr++;
            } else if (currentBall == 'G') {
                // Green balls are already in the correct position, just move to the next
                currentPtr++;
            } else { // currentBall == 'B'
                // Swap blue ball to the right
                swap(balls, currentPtr, bluePtr);
                bluePtr--;
            }
        }

        return balls;
    }

    public void swap(ArrayList<Character> balls, int i, int j) {

        char temp = balls.get(i);
        System.out.println("Temp: " + temp);
        System.out.println("After Temp is set the current state of balls list is: ");
        displayBalls1(balls);
        balls.set(i, balls.get(j));
        System.out.println("After the next character is set the current state of balls list is: ");
        displayBalls1(balls);
        balls.set(j, temp);
        System.out.println("After the variable J is set the current state of balls list is: ");
        displayBalls1(balls);
    }

    public void displayBalls(ArrayList<Character> balls) {

        for (char ball : balls) {
            System.out.print(ball + " ");
        }
        System.out.println();
    }

    static void displayBalls1(ArrayList<Character> balls) {

        for (char ball : balls) {
            System.out.print(ball + " ");
        }
        System.out.println();
    }

}
