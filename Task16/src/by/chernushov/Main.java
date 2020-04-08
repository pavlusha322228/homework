package by.chernushov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[25];
        for (int j = 0; j < a.length; j++) {
            a[j] = (int) (Math.random() * 10);
        }
        System.out.print(Arrays.toString(a));
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < a.length / 2; i++) {
            int b = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = b;
        }
        System.out.print(Arrays.toString(a));
    }
}
