public class Calculator {

    int insA;
    int insB;

    Calculator(int a, int b) {
        this.insA = a;
        this.insB = b;
        add();
        mul();
        System.out.println(div());
        System.out.println(sub());
    }

    void add() {
        System.out.println(insA + insB);
    }

    int sub() {
        return insA - insB;
    }

    int div() {
        return insA / insB;
    }

    void mul() {
        System.out.println(insA * insB);
    }

    public static void main(String[] args) {
        Calculator ob = new Calculator(20, 5);
    }
}
