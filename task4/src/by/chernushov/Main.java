package by.chernushov;

public class Main {

    public static void main(String[] args) {
	int a, b, r, r1;
	a = 10;
	b = 15;
	r1 = 9;
	r=(a*a+b*b)/4;
	if (r1*r1>=r){
        System.out.println("да");
    }
	else{
        System.out.println("Нет");
    }
    }
}
