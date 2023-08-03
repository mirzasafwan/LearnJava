class twoMethod {
    static int a = 0;
    int b = 0;

    // {
    // System.out.println(b);
    // }

    static void m1() {
        a++;
        System.out.println(a);
    }

    void m2() {
        b++;
        System.out.println(b);
    }

    public static void main(String[] args) {
        twoMethod obj1 = new twoMethod();
        twoMethod obj2 = new twoMethod();
        twoMethod obj3 = new twoMethod();
        m1(); // 1
        obj1.m1(); // 1
        obj2.m1(); // 2
        obj1.m2(); // 1 Memory will be allocated to particular object
        obj2.m2(); // 1 Memory will be allocated to particular object
        obj3.m2(); // 1 Memory will be allocated to particular object
    }
}