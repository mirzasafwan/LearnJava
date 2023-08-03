
class staticClass {
    static int a = m1();
    static {
        System.out.println("The Value of a in Static Block is " + a);
    }

    static int m1() {
        System.out.println("The value of a in Method is " + a);
        return 1;
    }

    public static void main(String[] args) {
        m1();
        System.out.println("The Value of a in Main Method " + a);
    }

}
