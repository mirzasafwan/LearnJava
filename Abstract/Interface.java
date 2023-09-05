interface A {
    int a = 1;

    void m1();
}

interface B {
    int b = 2;

    void m1();
}

public class Interface implements A, B {

    @Override
    public void m1() {
        System.out.println(A.a);
        System.out.println(B.b);
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        Interface a = new Interface();
        a.m1();
    }

}