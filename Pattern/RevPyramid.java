
public class RevPyramid {
    public static void main(String[] args) {
        int n = 5;
        // Reverse Pyramid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" " + (n - i));
            }
            System.out.println();
        }
    }
}
