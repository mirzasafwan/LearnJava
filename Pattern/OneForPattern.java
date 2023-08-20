public class OneForPattern {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;

        while (i < n * n) {
            System.out.print("* ");
            if ((i + 1) % n == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
