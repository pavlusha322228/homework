package by.chernushov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] mass = {4, 8, 15, 16, 23, 42, 4, 8, 15, 16, 23, 41};
        System.out.println(Arrays.toString(mass));
        boolean go = true;
        while (go) {
            go = false;
            for (int i = 1; i < mass.length; i++) {
                if (mass[i] > mass[i - 1]) {
                    int x = mass[i];
                    mass[i] = mass[i - 1];
                    mass[i - 1] = x;
                    go = true;
                }
            }
        }
        System.out.println(Arrays.toString(mass));

        int sum = 0;
        for (int i = 1; i < mass.length - 1; i++) {
            sum += mass[i];
        }
        System.out.println("Сумма = " + sum);
    }


}