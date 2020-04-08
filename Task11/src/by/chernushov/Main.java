package by.chernushov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            int a;
            boolean b = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число для проверки:");

            int num = scanner.nextInt();

            for (int i = 2; i <= num/2 ; i++){
                a = num % i;
                if (a == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(num + " является простым числом");
            } else {
                System.out.println(num + " является составным числом");
            }
    }
}
