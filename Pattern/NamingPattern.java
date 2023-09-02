import java.util.Scanner;

public class NamingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name");
        String inputLine = sc.nextLine();
        String[] words = inputLine.split(" "); // Split input into words

        int n = 5; // Set the value of n
        int m = (n + 1) / 2;

        // Iterate through each word
        for (String word : words) {
            String[] characters = word.split(""); // Split the word into characters

            // Iterate through each row of the pattern
            for (int i = 1; i <= n; i++) {
                int reverse = n - i + 1;
                for (String character : characters) {
                    boolean validCaseFound = false;
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
                            validCaseFound = true;

                            validCaseFound = true;
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
                            validCaseFound = true;

                            validCaseFound = true;
                            break;
                        case "C":
                            for (int j = 1; j <= n; j++) {
                                if (j == 1 || i == 1 || i == n) {
                                    System.out.print(" *");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            validCaseFound = true;

                            validCaseFound = true;
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
                            validCaseFound = true;
                            validCaseFound = true;
                            break;
                        case "E":
                            for (int j = 1; j <= n; j++) {
                                if (j == 1 || i == 1 || i == n || i == m) {
                                    System.out.print(" *");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            validCaseFound = true;
                            break;
                        case "F":
                            for (int j = 1; j <= n; j++) {
                                if (j == 1 || i == 1 || i == m) {
                                    System.out.print(" *");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            validCaseFound = true;
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
                            validCaseFound = true;
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
                            validCaseFound = true;
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
                            validCaseFound = true;
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
                            validCaseFound = true;
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
                            validCaseFound = true;
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
                            validCaseFound = true;
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
                            validCaseFound = true;
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

                            validCaseFound = true;
                            break;
                        case "T":
                            for (int j = 1; j <= n; j++) {
                                if (i == 1 || j == m) {
                                    System.out.print(" *");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            validCaseFound = true;
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
                            validCaseFound = true;
                            break;
                        case "Z":
                            for (int j = 1; j <= n; j++) {
                                if (i == 1 || i == n || j == reverse) {
                                    System.out.print(" *");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            validCaseFound = true;
                            break;

                        default:
                            validCaseFound = false;
                            break;
                    }
                    if (validCaseFound) {
                        System.out.print(" "); // Add space between patterns
                        validCaseFound = false; // Reset the flag
                    }
                }
                System.out.println(); // Move to the next row after printing a row of patterns
            }
        }
    }
}
