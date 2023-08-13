// public class This {
// // static int a; // this: to refer current class instance variable

// // This() {
// // System.out.println("This is This() Constructor");
// // }
// int roll_no, age;
// float fee;
// String name;

// This(int roll_no, String name, int age) {
// this.roll_no = roll_no;
// this.name = name;
// this.age = age;
// }

// This(int roll_no, String name, int age, float fee) {
// this(roll_no, name, age);
// this.fee = fee;
// }

// void display() {
// System.out.println(" " + roll_no + " " + name + " " + " " + age + " " + fee);
// }

// // void m1(int a) {
// // System.out.println("method " + a); // this: to invoke current instance
// // }

// // void m2() {
// // Scanner sc = new Scanner(System.in);
// // System.out.println("Enter ");
// // a = sc.nextInt();
// // m1(a); // this: to invoke current class method
// // }

// public static void main(String[] args) {
// This obj = new This(1, "Safwan", 25);
// This obj1 = new This(1, "Safwan", 25, 2000);
// obj.display();
// obj1.display();
// // obj.m2();
// }
// }

// class This {
// This m1;

// void m(This m1) {
// this.m1 = m1;
// System.out.println("method is invoked " + this.m1);
// }

// void p() {
// m(this);
// }

// public static void main(String args[]) {
// This s1 = new This();
// s1.p();
// }
// }

// class This {
// This aget(This obj) {
// return this;
// }

// void msg() {
// System.out.println("Hello java " + this);
// }

// public static void main(String[] args) {
// This t = new This();
// t.msg();
// }
// }

// Scanner s = new Scanner(System.in);
// System.out.println("Enter the value of n ");
// int n = s.nextInt();

// for (int i = n * 2 / 2 - 2; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print(" *");
// }
// System.out.println();
// }

// for (int i = 1; i < 5; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// for (int i = 1; i < 5; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// for (int i = n; i >= 0; i--) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 0; j <= 2 * i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// if (j == 1 || i == j || i == n / 2 + 2) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }

// System.out.println();
// }
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= n - i + 1; j++) {
// if (j == 1 || j == n - i + 1 || i == n / 2 + 1 || i == 1) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }

// System.out.println();
// }
// }

// Swastik
// if (n % 2 == 1) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n; j++) {

// if (i == n / 2 + 1 || j == n / 2 + 1) {
// System.out.print(" *");
// } else if (i == n / 4 + 1 && j == n / 4 + 1
// || i == n / 4 + 1 && j == n - i + 1
// || i == n - j + 1 && j == n / 4 + 1
// || i == 7 && j == 7) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }

// } else {
// System.out.println("Even bber Not supported");
// }
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print(" *");
// }
// for (int j = n - i + 1; j < n; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j < i; j++) {
// System.out.print(" ");
// }
// for (int j = i; j <= n; j++) {
// System.out.print(" *");
// }

// System.out.println();
// }
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" *");
// }
// for (int j = i; j < n; j++) {
// System.out.print(" ");
// }
// for (int j = i; j < n; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print(" *");
// }

// System.out.println();
// }
