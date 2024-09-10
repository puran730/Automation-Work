package java_projects;

import java.util.Scanner;

//W.A.J.P to check given number is Armstrong or not?
public class P005 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number:");
	        int number = sc.nextInt();
	        sc.close();

	        int originalNumber = number;
	        int result = 0;
	        int numberOfDigits = String.valueOf(number).length();

	        while (originalNumber != 0) {
	            int digit = originalNumber % 10;
	            result += Math.pow(digit, numberOfDigits);
	            originalNumber /= 10;
	        }

	        if (result == number) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
}
