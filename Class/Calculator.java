public class Calculator {
    static int a = 6;
    static int b = 2;

    static int add() {
        return a + b;
    }

    static int sub() {
        return a - b;
    }

    static int mul() {
        return a * b;
    }

    static int div() {
        return a / b;
    }

    static void result() {
        System.out.println(
                " a + b = " + add() + "\n a - b = " + sub()
                        + "\n a * b = "
                        + mul()
                        + "\n a / b = " + div());
    }

    public static void main(String[] args) {
        result();
    }
}
