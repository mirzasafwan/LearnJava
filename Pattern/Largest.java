class Largest {
    public static void main(String[] args) {
        int a[] = { 3, 1, 2, 3, 4, 5, 10, 4, 8 };
        int large = a[0];
        int temp = a[0];
        int small = a[0];
        int temp1 = a[0];
        for (int i = 0; i < a.length; i++) {
            // temp = a[i];
            // System.out.println(temp);
            if (large < a[i]) {
                temp = large;
                large = a[i];
            } else if (temp < a[i] && a[i] != large) {
                temp = a[i];
            }
            if (small > a[i]) {
                temp1 = small;
                small = a[i];
            } else if (temp1 > a[i] && temp1 != small) {
                temp1 = a[i];
            }

        }
        System.out.println("Second Largest " + temp);
        System.out.println("Secong Smallest " + temp1);

    }

}