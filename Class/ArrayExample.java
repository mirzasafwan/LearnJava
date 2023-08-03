import java.util.Scanner;

class ArrayExample extends Object {
    static String[] getnameofArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] names = new String[n];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name:");
            names[i] = sc.nextLine();
        }

        System.out.println("The names in the list are:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("The name of person is: " + names[i]);
        }

        return names;
    }

    public static void main(String args[]) {
        getnameofArray();
    }
}