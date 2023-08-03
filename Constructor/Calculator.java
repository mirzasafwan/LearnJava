public class Calculator {

    int a;
    int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
        add();
        mul();
        System.out.println(div());
        System.out.println(sub());
    }

    void add() {
        System.out.println(a + b);
    }

    int sub() {
        return a - b;
    }

    int div() {
        return a / b;
    }

    void mul() {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Calculator ob = new Calculator(20, 5);
    }
}
