// public class fibonacciSeries {
//     public static void main(String[] args) {
//         int n1 = 0, n2 = 1, n3, i, c = 10;
//         System.out.print(n1 + " " + n2);
//         for (i = 2; i < c; i++) {
//             n3 = n1 + n2;
//             System.out.print(" " + n3);
//             n1 = n2;
//             n2 = n3;
//         }

//     }
// }

// Recurrsive fibonacciSeries
class fibonacciSeries {
    static int c = 0, n3, n1 = 0, n2 = 1;

    static void printFibonacci(int c) {
        if (c < 10) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(c + 1);
        }
    }

    public static void main(String[] args) {
        System.out.print(n1 + " " + n2);
        printFibonacci(c + 2);
    }
}