import java.util.Scanner;

public class NamingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name");
        String s = sc.next();
        String[] a = s.split("");
        
        int n = 5; // Set the value of n
        
        for (int i = 1; i <= n; i++) { // Iterate through each row of the pattern
            for (String character : a) { // Iterate through each character of the name
                switch (character.toUpperCase()) {
                    case "S":
                        for (int j = 1; j <= n; j++) { // Iterate through each column of the pattern
                            if (j == 1 && i <= (n / 2) + 1 || i == 1
                                    || i == (n / 2) + 1 || j == n && i > n / 2
                                    || i == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "A":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 || j == n
                                    || i == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    default:
                        System.out.print("  "); // Print a space for characters other than 'S' and 'A'
                }
                System.out.print("  "); // Add a space between patterns
            }
            System.out.println("  "); // Move to the next row after printing a row of patterns
        }
    }
}