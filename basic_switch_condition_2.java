package com.company;

public class basic_switch_condition_2 {
    public static void main(String[] args){
        int day = 6;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the weekend");
        }
    }
}
