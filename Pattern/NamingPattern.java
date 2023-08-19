import java.util.Scanner;

public class NamingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name");
        String s = sc.next();
        String[] a = s.split("");

        int n = 5; // Set the value of n

        // Iterate through each row of the pattern
        iLoop: for (int i = 1; i <= n; i++) {
            for (String character : a) { // Iterate through each character of the name
                switch (character.toUpperCase()) {
                    case "A":
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            if (j == 1 || j >= i || i == (n / 2) + 1) {
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
                            if (j == 1 || i == (n / 2) + 1 && j < n || i == 1 && j <= n - 1
                                    || j == n && i != 1 && i != n
                                    || i == n && j <= n - 1) {
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
                            if (j == 1 || i == 1 || i == n || i == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "F":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 || i == (n / 2) + 1) {
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
                            if (j == 1 || j == n || i == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    // I
                    case "I":
                        for (int j = 1; j <= n; j++) {
                            if (i == 1 || i == n || j == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    // J

                    // K

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
                            if (j == 1 || j == n || i <= (n + 1) / 2 && j == i
                                    || j >= (n + 1) / 2 && j == n - i + 1) {
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

                    case "S":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 && i <= (n / 2) + 1 || i == 1 || i == (n / 2) + 1 || j == n && i > n / 2
                                    || i == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }

                        break;
                    case "T":
                        for (int j = 1; j <= n; j++) {
                            if (i == 1 || j == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    case "W":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || j == n || i >= (n + 1) / 2 && j == n - i + 1
                                    || i >= (n + 1) / 2 && j == i) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "Z":
                        for (int j = 1; j <= n; j++) {
                            if (i == 1 || i == n || j == n - i + 1) {
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