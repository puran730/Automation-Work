package java_projects;

import java.util.Scanner;

//W.A.J.P to take three numbers from the user and print the greatest
//number
public class Prog1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int i = sc.nextInt();
		System.out.println("Enter second number: ");
		int j = sc.nextInt();
		System.out.println("Enter third number: ");
		int k = sc.nextInt();
		sc.close();
		
		 // Finding the greatest number
        int greatest = i;

        if (j > greatest) {
            greatest = j;
        }

        if (k > greatest) {
            greatest = k;
        }

        // Printing the greatest number
        System.out.println("The greatest number is: " + greatest);
	}

}
