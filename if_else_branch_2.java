package com.company;

public class if_else_branch_2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        System.out.println("ini adalah awal dari program");
        if (a == 5) {
            if (b == 10) {
                System.out.println("ini adalah dimana a = 5dan b = 10");
            } else {
                System.out.println("ini adalah dimana a = 5 dan b bukan 10");
            }
        } else {
            System.out.println("ini adalah dimana a salah");
        }
        System.out.println("ini adalah akhir dari program");
    }
}
