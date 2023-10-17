import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        boolean flag = false;

        if (n == 0 || n == 1) {
            System.out.println(n + " Not a prime");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " Not a prime");
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(n + " is a prime number");
            }
        }

    }
}
