
public class labelForLoop {
    public static void main(String[] args) {

        first: for (int i = 0; i < 5; i++) {
            if (i == 1) {
                continue first;
            }
            System.out.println("The value of i is" + i);
        }
        System.out.println();
        second: for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break second;
            }
            System.out.println("The value of j is" + i);
        }
    }
}

// class labelForLoop {
// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {
// if (i == 5) {
// break;
// }
// System.out.println(i);
// }
// }
// }