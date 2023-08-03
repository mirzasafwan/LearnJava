import java.util.Scanner;

class objTask {
    void add(int a, int b) {
        System.out.println("Addition " + a + " + " + b + " = " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Substraction " + a + " - " + b + " = " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("Multiplication " + a + " * " + b + " = " + (a * b));
    }

    void div(int a, int b) {
        System.out.println("Division " + a + " \u00F7 " + b + " = " + (a / b));
    }

    public static void main(String[] args) {
        objTask obj = new objTask();
        // obj.add(5, 20);
        // obj.mul(1, 20);
        // obj.div(40, 20);
        // obj.sub(40, 20);

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a value of and b");
        System.out.println("1-Addition\n2-Substraction\n3-Multiplication\n4-Division");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                obj.add(5, 20);
                break;
            case 2:
                obj.sub(40, 20);
                break;
            case 3:
                obj.mul(1, 20);
                break;
            case 4:
                obj.div(40, 20);
                break;
            default:
                System.out.println("Invalid Data " + n);
                break;
        }
    }
}