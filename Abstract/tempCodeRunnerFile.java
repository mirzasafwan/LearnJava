  int[] a = { 1, 2, 3, 4, 5 };
        int n = 1;
        for (int i = 0; i < n; i++) {
            int j;
            int temp = a[0];
            for (j = 0; j < a.length; j++) {
                a[j] = a[j + 1];
            }
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }