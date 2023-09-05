interface A {
    int a = 1;

    int m1();
}

interface B {
    int b = 2;

    int m1();
}

public class Interface implements A, B {

    @Override
    public int m1() {
        return b + a;
    }

    public static void main(String[] args) {
        Interface a = new Interface();
        System.out.println(a.m1());
    }

}