package by.chernushov;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размер создаваемого массива");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int size = Integer.parseInt(String.valueOf(arraySize));
        int marks [] = new int[size];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int)(Math.random() * 50);
            System.out.println(marks [i] + "/");
        }
        System.out.println("_________________________________________________");

        int maxDigit = marks[0];
        for (int i = 0; i < marks.length; i++){
            if (maxDigit < marks[i]){
                maxDigit = marks[i];
            }
        }
        for (int i = 0; i < marks.length; i++){
            if (maxDigit == marks[i]){
                System.out.println("Индекс элемента массива, содержащего мах элемент= " + i);
            }
        }

    }
}