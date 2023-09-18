// interface A {
// int m1();
// }

// interface B {
// String m2();
// }

// abstract class C implements A, B {
// public int m1() {
// System.out.println("In method m1");
// return 1;
// }

// public String m2() {
// System.out.println("In method m2");
// return "Safwan";
// }
// }

// class D extends C {
// int a = m1();
// String b = m2();

// void m3() {
// System.out.println(a + " " + b);
// }
// }

// public class Test {

// public static void main(String[] args) {
// C c1 = new D();
// D d1 = new D();
// c1.m1();
// c1.m2();
// System.out.println(d1.m1());
// System.out.println(d1.m2());
// d1.m3();
// }
// }

// import java.util.Scanner;

// class Test {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String[] a = new String[5];
// for (int i = 0; i < a.length; i++) {
// System.out.println("Enter Name");
// a[i] = sc.next();
// }
// for (String str : a) {
// if (str.charAt(0) == 'b' || str.charAt(0) == 'B') {
// System.out.println("The Letter starts with b is " + str);
// }
// }
// }
// }
class Test {
    public static void main(String[] args) {
        int p = 34;
        switch (p) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            default:
                System.out.print("Default");
                break;
        }

    }
}