import java.util.Scanner;

class objTask {
    void add(int a, int b) {
        System.out.println("Addition " + a + " + " + b + " = " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction " + a + " - " + b + " = " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("Multiplication " + a + " * " + b + " = " + (a * b));
    }

    void div(int a, int b) {
        System.out.println("Division " + a + " ÷ " + b + " = " + (a / b));
    }

    public static void main(String[] args) {
        objTask obj = new objTask();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        boolean value = true;
        while (value) {
            System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Exit");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    obj.add(a, b);
                    break;
                case 2:
                    obj.sub(a, b);
                    break;
                case 3:
                    obj.mul(a, b);
                    break;
                case 4:
                    obj.div(a, b);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    value = false;
                    break;
                default:
                    System.out.println("Invalid Data " + n);
                    break;
            }
        }
    }
}
