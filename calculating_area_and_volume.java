package com.company;
import  java.util.Scanner;

public class calculating_area_and_volume {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas,tinggi, volume;
        System.out.println("MENGITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas ="+luas);
        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi =");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume ="+volume);
    }
}
