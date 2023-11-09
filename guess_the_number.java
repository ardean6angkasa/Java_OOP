package com.company;
import java.util.Scanner;

public class guess_the_number {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        System.out.print("masukan nilai tebakan anda: ");
        nilaiTebakan=inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah: " + nilaiTebakan);
        statusTebakan=(nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda: " + statusTebakan);
        System.out.print("masukan nilai diantara 4 dan 9: ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("nilai anda: "+statusTebakan);
    }
}
