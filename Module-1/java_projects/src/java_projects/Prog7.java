package java_projects;
//W.A.J.P to Print pattern
public class Prog7 {
	public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        int n = 5;  // Height of the triangle

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print digits with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Move to the next line
            System.out.println();
        }
        int k = 3;  // Height of the pattern (half)
        
        // Upper half
        for (int i = 1; i <= k; i++) {
            for (int j = i; j < k; j++) {
                System.out.print("  "); // Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* "); // Print stars
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = k - 1; i >= 1; i--) {
            for (int j = k; j > i; j--) {
                System.out.print("  "); // Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* "); // Print stars
            }
            System.out.println();
        }
    }
}
