
// class ForLoop {

// public static void main(String[] args) {
// int sum = 0;
// int j = 0;
// for (j = 0; j < 5; j++) {
// sum = sum + j;
// // System.out.println(sum);
// }
// System.out.println("The " + j + " natural numbers are " + sum);
// }
// }

// class ForLoop {
// public static void main(String[] args) {
// int i = 0;
// // for (i = 0; i < 10; i++) {
// // System.out.println(i);
// // i++;
// // }
// for (i = 0; i < 10; i++) {
// i++;
// System.out.println(i);
// }
// }
// }

// class ForLoop {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            // System.out.print("*");
            // for (int j = 0; j <= i; j--) {
            // // prints space between two stars
            // System.out.print(" ");
            // }
        }

    }
}
// class ForLoop {
// public static void main(String[] args) {
// int i, j, row = 6;
// // Outer loop work for rows
// for (i = 0; i < row; i++) {
// // inner loop work for space
// for (j = row - i; j > 1; j--) {
// // prints space between two stars
// System.out.print(" ");
// }
// // inner loop for columns
// for (j = 0; j <= i; j++) {
// // prints star
// System.out.print("* ");
// }
// // throws the cursor in a new line after printing each line
// System.out.println();
// }
// }
// }