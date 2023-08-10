
// Inheritance() {
// this(12);
// // System.out.println(0);
// }

// Inheritance(int a) {

// this(12.0f);
// System.out.println(a);
// }

// Inheritance(float a) {
// this(1122.0);
// // System.out.print(a);
// }

// Inheritance(double a) {
// System.out.print(a);

// }

class Inheritance extends Object {
    Inheritance() {
        super();
    }

    void m1() {
        System.out.println("Inheritance.m1()");
    }

    public static void main(String[] args) {
        Inheritance n1 = new Inheritance();
        n1.m1();
    }
}
