public class A {
    int data = 50;

    void change(int data) {
        this.data = data;
        // System.out.println(data);

    }

    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.data);

        a.change(100);

        System.out.println(a.data);

    }
}
