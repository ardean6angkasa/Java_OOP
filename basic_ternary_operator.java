package com.company;
import java.util.*;

public class basic_ternary_operator {
    public static void main(String[] args) {
        int input, x;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        input = inputUser.nextInt();
        x = (input == 10) ? (input * input) : (input / 2);
        System.out.println("hasilnya " + x);
    }
}
