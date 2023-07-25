
class Calculator {
    static int a = 10, b = 20;

    static int add() {
        int c = a + b;
        return c;
    }

    static int mul() {
        int c = a * b;
        return c;
    }

    static float div() {
        float c = ((float) a / b);
        return c;
    }

    static int minus() {
        int c = a - b;
        return c;
    }

    public static void main(String aString[]) {
        System.out.println(add());//
        System.out.println(mul());//
        System.out.println(div());//
        System.out.println(minus());//

    }
}
