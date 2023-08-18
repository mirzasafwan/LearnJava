import java.util.Scanner;

public class NamingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The value of n");
        // int n = sc.nextInt();
        int n = 5;
        System.out.println("Enter Your name");
        String s = sc.next();

        String[] a = s.split("");
        for (String character : a) {

            switch (character.toUpperCase()) {
                case "S":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 && i <= (n / 2) + 1 || i == 1 || i == (n / 2) + 1 || j == n && i > n / 2
                                    || i == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case "A":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 || j == n || i == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case "F":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 || i == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case "W":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || j == n || i >= (n + 1) / 2 && j == n - i + 1
                                    || i >= (n + 1) / 2 && j == i) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case "N":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == j || j == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case "E":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 || i == n || i == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case "M":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || j == n || i <= (n + 1) / 2 && j == i
                                    || j >= (n + 1) / 2 && j == n - i + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case "D":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 && j <= n - 1 || j == n && i != 1 && i != n - 1
                                    || i == n && j <= n - 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("No such letter found");
            }

        }

    }

}
