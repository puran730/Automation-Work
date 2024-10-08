package java_projects;

import java.util.Scanner;

//W.A.J.P for create Fibonacci Series
public class P006 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number of terms for the Fibonacci series:");
	        int n = sc.nextInt();
	        sc.close();

	        int firstTerm = 0, secondTerm = 1;

	        System.out.println("Fibonacci Series:");

	        for (int i = 1; i <= n; ++i) {
	            System.out.println(firstTerm + " ");

	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	    }
}
