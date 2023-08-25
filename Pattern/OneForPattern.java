// public class OneForPattern {
//     public static void main(String[] args) {
//         int n = 5;
//         int i = 0;

//         while (i < n * n) {
//             System.out.print("* ");
//             if ((i + 1) % n == 0) {
//                 System.out.println();
//             }
//             i++;
//         }
//     }
// }
public class OneForPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n * n; i++) {
            if (i <= n || i <= n + 1) {
                System.out.print(" *");
            } else {
                System.out.print("  ");
            }
            if (i % n == 0) {
                System.out.println();
            }
        }

    }
}
