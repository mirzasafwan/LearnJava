import java.util.Scanner;

public class specialPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // if (i <= n / 2 && j > n / 2) {
                // System.out.print(" *");
                // } else if (i <= n / 2 && j <= n / 2) {
                // System.out.print(" 2");
                // } else if (i > n / 2 && j <= n / 2) {
                // System.out.print(" 1");
                // } else if (i >= n / 2 && j >= n / 2 + 1) {
                // System.out.print(" &");
                // }

                // Fan Pattern
                // if (i <= (n / 2) + 1 && j <= (n / 2) + 1 && i >= j
                // || i <= (n / 2) + 1 && j >= (n / 2) + 1 && j <= n - i + 1
                // || i >= (n / 2) + 1 && j < (n / 2) + 1 && j >= n - i + 1
                // || i >= (n / 2) + 1 && j >= (n / 2) + 1 && i <= j) {

                // System.out.print(" *");
                // } else {
                // System.out.print(" ");
                // }

                // right left pyramid
                if (i >= (n / 2) + 1 && j < (n / 2) + 1 && j <= n - i + 1
                        || i >= (n / 2) + 1 && j >= (n / 2) + 1 && i <= j
                        || i <= (n / 2) + 1 && j >= (n / 2) + 1 && j >= n - i + 1
                        || i <= (n / 2) + 1 && j <= (n / 2) + 1 && i >= j) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
