import java.util.Scanner;

public class StringLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n");
        int n = sc.nextInt();
        if (n > 5 || n <= 20) {
            System.out.println("weird");
        }
    }
}
