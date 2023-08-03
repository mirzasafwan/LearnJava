public class paramCons {
    int a = 10;
    int b = 20;

    paramCons() {
        int a = this.a;
        System.out.println(a);

    }

    void m1() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        paramCons ob = new paramCons();
        ob.m1();
    }
}
