class Pattern {
    public static void main(String[] args) {
        int[] a = { 5, 4, 3, 2, 1 };
        // System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - a[i]; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < a[i]; j++) {
                System.out.print(" " + a[i]);
            }

            System.out.println();
        }
    }
}