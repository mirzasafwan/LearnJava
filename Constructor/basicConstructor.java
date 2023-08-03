public class basicConstructor {
    int a;

    basicConstructor() {
        System.out.println("Constructor " + this.a);
    }

    // static void m1() {
    // System.out.println("Method" + a);
    // }

    public static void main(String[] args) {
        basicConstructor ob = new basicConstructor();
    }
}
