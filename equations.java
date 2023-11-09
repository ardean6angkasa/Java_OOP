package com.company;

public class equations {
    public static void main(String[] args) {
        int a,b;
        boolean hasilKomparasi;
        System.out.println("===== PERSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d -->%s\n",a,b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d -->%s\n",a,b, hasilKomparasi);

        System.out.println("===== PERTIDAKSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d -->%s\n",a,b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d -->%s\n",a,b, hasilKomparasi);

        System.out.println("===== KURANG DARI");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d -->%s\n",a,b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d -->%s\n",a,b, hasilKomparasi);

        System.out.println("===== LEBIH DARI");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d -->%s\n",a,b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d -->%s\n",a,b, hasilKomparasi);

        System.out.println("===== KURANG DARI SAMA DENGAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d -->%s\n",a,b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d -->%s\n",a,b, hasilKomparasi);

        System.out.println("===== LEBIH DARI SAMA DENGAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d >= %d -->%s\n",a,b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d >= %d -->%s\n",a,b, hasilKomparasi);
    }
}
