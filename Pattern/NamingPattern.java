import java.util.Scanner;

public class NamingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name");
        String s = sc.next();
        String[] a = s.split("");

        int n = 5; // Set the value of n
        int m = (n + 1) / 2;

        // Iterate through each row of the pattern
        iLoop: for (int i = 1; i <= n; i++) {
            int reverse = n - i + 1;
            for (String character : a) { // Iterate through each character of the name
                switch (character.toUpperCase()) {
                    case "A":
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            if (j == 1 || j >= i || i == m) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }

                        }
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }

                        break;
                    case "B":
                        for (int j = 1; j <= n; j++) {
                            if (i == 1 && j <= n - 1 || i == m && j <= n - 1 || j <= n - 1 && i == n || j == 1
                                    || j == n && i % 2 == 0) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "C":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 || i == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    case "D":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 && j <= n - 1 || j == n && i != 1 && i != n
                                    || i == n && j <= n - 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "E":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 || i == n || i == m) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "F":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 || i == m) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    // G

                    // H
                    case "H":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || j == n || i == m) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    // I
                    case "I":
                        for (int j = 1; j <= n; j++) {
                            if (i == 1 || i == n || j == m) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    // J

                    // K
                    case "K":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == m && j <= (n) / 2 || i <= m && j == reverse
                                    || i >= m && i == j) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    // L

                    case "L":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    // L
                    case "M":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || j == n || i <= m && j == i
                                    || j >= m && j == reverse) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    // N
                    case "N":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == j || j == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "R":
                        for (int j = 1; j <= n; j++) {
                            if (i == 1 && j <= n - 1 || j == 1 || i == n / 2 + 1 && j <= n - 1
                                    || i == j && i >= m || i == 2 && j == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    case "S":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 && i <= m || i == 1 || i == m || j == n && i > n / 2
                                    || i == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }

                        break;
                    case "T":
                        for (int j = 1; j <= n; j++) {
                            if (i == 1 || j == m) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    case "W":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || j == n || i >= m && j == reverse
                                    || i >= m && j == i) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "Z":
                        for (int j = 1; j <= n; j++) {
                            if (i == 1 || i == n || j == reverse) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    default:
                        System.out.println("No data Found");

                        break iLoop;
                }
                System.out.print(" "); // Add a space between patterns
            }
            System.out.println(); // Move to the next row after printing a row of patterns
        }
    }
}