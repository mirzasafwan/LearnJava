public class basicConstructor {
    static int a;

    basicConstructor() {
        System.out.println("Constructor" + a);
    }

    static void m1() {
        System.out.println("Method" + a);
    }

    public static void main(String[] args) {
        m1();
        basicConstructor ob = new basicConstructor();

    }
}
