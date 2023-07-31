
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
// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 0; j < i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// class ForLoop {
// public static void main(String[] args) {

// for (int i = 0; i < 5; i++) {

// for (int j = 0; j < 5; j++) {
// if (i <= j) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// // System.out.print("*");
// // for (int j = 0; j <= i; j--) {
// // // prints space between two stars
// // System.out.print(" ");
// // }
// }

// }
// }
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

// Pyramid
// class ForLoop {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 0; j < n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 0; j < i; j++) {
// System.out.print(" " + i);
// }
// System.out.println();
// }
// }
// }
// pyramid abc
// class ForLoop {
// public static void main(String[] args) {
// int n = 26;
// char cha = 'a';
// for (int i = 1; i <= n; i++) {
// // for (int j = 0; j < n - i + 1; j++) {
// // System.out.print(" " + i);
// // }
// // for (int j = 0; j < i; j++) {
// // System.out.print(" ");
// // }
// for (int k = n; k >= 0; k--) {
// if (i > k) {
// System.out.print(" " + cha);

// } else {
// System.out.print(" ");

// }
// }
// System.out.println();
// cha++;
// }
// }
// }

// class ForLoop {
// public static void main(String[] args) {
// int n = 26;
// char ch = 'a', ch1 = 'z';
// for (int i = 1; i <= n; i++) {
// for (int k = n + 2; k > 0; k--) {
// if (k > i) {
// System.out.print(" ");
// } else {
// System.out.print(" " + ch);
// }
// }
// System.out.println();
// ch++;
// }
// for (int i = 1; i <= n; i++) {
// for (int k = 0; k <= i; k++) {
// System.out.print(" ");
// }
// for (int k = 0; k < n - i + 1; k++) {
// System.out.print(" " + ch1);
// }
// System.out.println();
// ch1--;
// }
// }
// }

// Reverse Pyramid and Default Pyramid
// class ForLoop {
// public static void main(String[] args) {
// int n = 26;
// char chaAsc = 'a', chaDsc = 'z';
// for (int i = 1; i <= n; i++) {
// for (int j = 0; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print(" " + chaAsc);
// }
// System.out.println();
// chaAsc++;
// }

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j < n - i + 2; j++) {
// System.out.print(" " + chaDsc);
// }
// System.out.println();
// chaDsc--;
// }
// }
// }

class ForLoop {
    public static void main(String[] args) {
        int n = 5;
        // Default Pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }

        // Reverse Pyramid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" " + (n - i));
            }
            System.out.println();
        }
    }
}