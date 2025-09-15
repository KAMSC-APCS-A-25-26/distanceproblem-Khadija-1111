/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */


import java.util.Scanner;


public class DistanceMultiple {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // tells scanner to delimit by parantheses, commas, and whitespace
        sc.useDelimiter("[(),\\s]+");

        System.out.println("\nSyeda Khadija\nAPCS-A\nLewis 2.8 Distance Formula Program\n\n");

        // prompts the user for a number of times the program will run
        System.out.print("Enter the number of runs: ");
        int numRuns = sc.nextInt();

        // runs the program for a number of times given by the user
        for (int j = 0; j < numRuns; j++) {
            // prompts the user for two coordinates and stores their values into variables
            System.out.print("\n\nEnter two xy coordinates: ");
            double x1 = sc.nextInt();
            double y1 = sc.nextInt();
            double x2 = sc.nextInt();
            double y2 = sc.nextInt();

            // calculates the distance between both coordinates using the distance formula
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // prints the distance
            System.out.println("\nThe distance between your points is " + distance);
        }
    }

}