// public class Calculator {

// static int add(int a, int b) {
// return a + b;
// }

// static int sub(int a, int b) {
// return a - b;
// }

// static int mul(int a, int b) {
// return a * b;
// }

// static int div(int a, int b) {
// return a / b;
// }

// public static void main(String[] args) {
// System.out.println(
// " a + b = " + add(10, 20) + "\n a - b = " + sub(20, 10)
// + "\n a * b = "
// + mul(2, 3)
// + "\n a / b = " + div(6, 2));
// }
// }

// class Calculator {
// int a = m1();
// static int b = m2();
// {
// System.out.println("Instance Initialize Block");//
// }
// static {
// System.out.println("Static block");//
// }

// int m1() {
// System.out.println("Non Static Method");//
// return 1;
// }

// static int m2() {
// System.out.println("Static Method");//
// return 1;
// }

// public static void main(String[] args) {
// Calculator obj = new Calculator();

// }
// }

// class Calculator {
// int id;

// Calculator(int a, int b) {
// id = a;
// id = b;
// System.out.println(a + b);
// System.out.println(a * b);
// System.out.println(a / b);
// System.out.println(a - b);
// }

// public static void main(String[] args) {
// Calculator a = new Calculator(10, 2);
// }
// }

// class Calculator {
// public static void pushZero(
// int[] arr,
// int left, int right) {
// while (left < right) {
// if (arr[left] == 0) {
// if (arr[right] != 0) {
// // Swap
// int t = arr[left];
// arr[left] = arr[right];
// arr[right] = t;
// } else {
// right = right - 1;
// }

// } else {
// left = left + 1;
// }

// }
// System.out.println(arr.hashCode());
// }

// public static void main(String[] args) {
// int[] arr = { 10, 0, 2, 0, 3, 1, 5, 6, 8, 0, 1, 21 };
// // String name = "shaikh";
// // int len = name.length();
// int left = 0;
// int right = arr.length - 1;
// pushZero(arr, left, right);

// }
// }
