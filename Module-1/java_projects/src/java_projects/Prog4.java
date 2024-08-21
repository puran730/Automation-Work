package java_projects;

import java.util.Scanner;
//W.A.J.P to check given number is Prime or not?
public class Prog4 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        sc.close();

	        boolean isPrime = true;

	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break; 
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
      }
}
