abstract class A {
    public abstract int m1();

    public abstract int m2(int x);

    int y;
    int x = 5;

    int m4(int x, int y) {
        this.x = x;

        System.out.println(x + " " + this.y);
        return 'c';
    }

}

class B extends A {

    B(float y) {
        y = 10;
        System.out.println(super.y);

    }

    {
        System.out.println("In IIB of B " + y);
    }

    public int m1() {
        System.out.println("m1");
        return 'c';
    }

    public int m2(int x) {
        m4(10, 2);
        System.out.println("m2");
        return 1;
    }

}

class Abstract {
    public static void main(String[] args) {
        B b = new B(1.0f);
        b.m1();
        b.m4(10, 20);
        b.m2(10);
    }
}
