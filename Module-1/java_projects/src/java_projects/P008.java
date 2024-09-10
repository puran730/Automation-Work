package java_projects;
//W.A.J.P to compute the sum of the first 100 prime numbers
public class P008 {
	 public static void main(String[] args) {
	        int count = 0;
	        int num = 2; //first prime number
	        int sum = 0;

	        while (count < 100) {
	            if (isPrime(num)) {
	                sum += num;
	                count++;
	            }
	            num++;
	        }

	        System.out.println("The sum of the first 100 prime numbers is: " + sum);
	    }

	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
