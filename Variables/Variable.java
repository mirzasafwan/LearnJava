class Variable {
    int a;

    void get() {
        a = 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Variable obj1 = new Variable();
        obj1.get();
    }
}
