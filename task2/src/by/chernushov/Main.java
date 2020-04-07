package by.chernushov;

public class Main {

    public static void main(String[] args) {

        int t, s, m, m1, h, h1, d, d1, w, w1;
        t = 370000000;
        s = t % 60;
        m1 = (t - s) / 60;
        m = m1 % 60;
        h1 = (m1 - m) / 60;
        h = h1 % 24;
        d1 = (h % 24);
        d = (d1 % 7);
        w = (d1 / 7);
        System.out.println(w+ " недель " + d + " дней " +h+ " часов " + m + " минут " + s + "секунд");

    }
}
