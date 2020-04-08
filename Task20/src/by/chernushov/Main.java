package by.chernushov;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String text = JOptionPane.showInputDialog("Введите текст:");
        StringBuilder temporaryText = new StringBuilder();

        text = text.replaceAll("[!.,:;-]", "");
        text = text.replaceAll("-?[0-9]+", "");
        String[] words = text.split(" ");

        for (String word : words) {
            temporaryText.append(word.charAt(word.length() - 1));
        }
        JOptionPane.showMessageDialog(null, "Текст из последних букв в ваших словах:\n" + temporaryText);
    }
}