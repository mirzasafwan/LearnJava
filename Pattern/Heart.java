import java.util.Scanner;

public class Heart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = n * 2 / 3; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j <= n - i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j <= n - i + 1) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {

                if (i <= j && j <= 2 * n - i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
