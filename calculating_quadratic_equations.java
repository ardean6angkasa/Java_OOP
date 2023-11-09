package com.company;
import java.util.Scanner;

public class calculating_quadratic_equations {
    public static void main(String[] args) {
        int hasil= 5* 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2- 10;
        System.out.println(hasil);

        hasil = 60/(2+10);
        System.out.println(hasil);
        Scanner userInput = new Scanner(System.in);
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;
        System.out.print("nilai x= ");
        x = userInput.nextInt();
        System.out.print("gradient m= ");
        m = userInput.nextInt();
        System.out.print("nilai c= ");
        c = userInput.nextInt();
        int y = (m*x*c)+c;
        System.out.println("nilai y= " + y);
    }
}
