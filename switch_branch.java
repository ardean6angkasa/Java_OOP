package com.company;
import java.util.*;

public class switch_branch {
    public static void main(String[] args) {
        String input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("panggil nama: ");
        input = inputUser.next();
        switch(input){
            case "otong":
                System.out.println("saya otong dan hadir Bos!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir Bos!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir Bos!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!");
        }
        System.out.println("selesai program");
    }
}
