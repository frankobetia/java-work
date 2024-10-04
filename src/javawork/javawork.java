package javawork;

import java.util.Scanner;

public class javawork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
        int number;
        // this loop will run until the user enters a negative number
        do {
            System.out.print("Enter a number (negative to quit): ");
            number = Scanner.nextInt();
            if (number >= 0) {
                System.out.println("You entered: " + number);
            } else {
                System.out.println("Exiting...");
            }
        } while (number >= 0);
        Scanner.close();
	}

}
