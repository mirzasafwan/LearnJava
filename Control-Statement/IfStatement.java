public class IfStatement {
    static int a = 10, b = 10, c = 20;

    int checkCondition() {
        if (a + b > c) { // if condition is true
            return 1; // this statement will execute
        } else if (a + b < c) { // if 1st condition is false 2nd condition will be checked if its true then 2nd
                                // codition will execute
            return 0; // this statement will execute
        } else { // else if both is false than else will work
            return 2;// this statement will execute
        }

    }

    public static void main(String[] args) {
        IfStatement obj1 = new IfStatement();
        System.out.println(obj1.checkCondition());
    }
}