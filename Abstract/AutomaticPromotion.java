abstract class A {

    {
        int a = 20;
        System.out.println("IIB Int " + a);
    }
    static {
        int a = 100;
        System.out.println("Static Block Int " + a);
    }

    abstract void m1(final short a, final short b);

    A() {
        int a = 20;
        System.out.println("Hello " + a);
    }

    abstract void m1(final int a);

    abstract void m1(final short a, final float b, final String c);
}

class B extends A {
    void m1(final int a) {
        System.out.println("M1 method with Int " + a);
    }

    void m1(final short a, final short b) {
        System.out.println("M1 method with Short " + b);
    }

    void m1(final short a, final float b, final String c) {
        System.out.println("M1 method with String " + c);
    }
}

public class AutomaticPromotion {
    public static void main(String[] args) {
        // A a = new B();
        // a.m1(20);
        // a.m1((short) 1, (short) 1);
        // a.m1((short) 1, 50.55f, "Safwan");

    }
}
