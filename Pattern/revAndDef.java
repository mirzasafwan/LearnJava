// Kaaju Katli 4 Inner Loop and 1 Outer Loop
// import java.util.Scanner;

// public class revAndDef {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the value of n");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print(" *");
// }
// for (int j = n - i + 1; j < n; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j < i; j++) {
// System.out.print(" ");
// }
// for (int j = i; j <= n; j++) {
// System.out.print(" *");
// }

// System.out.println();
// }
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" *");
// }
// for (int j = i; j < n; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print(" *");
// }

// System.out.println();
// }

// }
// }

// Kaaju Katli 3 Inner Loop and 1 Outer Loop
// import java.util.Scanner;

// class revAndDef {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the value of n");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print(" *");
// }
// for (int j = 1; j < 2 * i - 1; j++) {
// System.out.print(" ");
// }
// for (int j = 0; j <= n - i; j++) {
// System.out.print(" *");
// }
// System.out.println();
// }
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" *");
// }
// for (int j = 2; j < 2 * (n - i + 1); j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print(" *");
// }
// System.out.println();
// }
// }
// }

// Kaaju Katli with 2 inner for loop and 1 outer For Loop

// class revAndDef {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the value of n");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n; j++) {
// if (i == 1 || j == 1 || j <= n - i + 1) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }
// for (int j = 1; j <= n; j++) {
// if (i == 1 || j == n || j >= i) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n; j++) {
// if (i == n || j == 1 || j <= i) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }
// for (int j = 1; j <= n; j++) {
// if (i == n || j == n || j >= n - i + 1) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }

// }
// }

import java.util.Scanner;

class revAndDef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j <= n - i - 1 && i <= j
                            || j >= n - i - 1 && i >= j) {
                        System.out.print(" *");
                    } else
                        System.out.print("  ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Odd Number supported only");
        }

    }
}