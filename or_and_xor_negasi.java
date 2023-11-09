package com.company;

public class or_and_xor_negasi {
    public static void main(String[] args) {
        boolean a,b,c;
        System.out.println("===== OR (||) ====");
        a = false;
        b= false;
        c = (a||b);
        System.out.println(a + "||"+b+"="+c);
        a = false;
        b= true;
        c = (a||b);
        System.out.println(a + "||"+b+"="+c);
        a = true;
        b= false;
        c = (a||b);
        System.out.println(a + "||"+b+"="+c);
        a = true;
        b= true;
        c = (a||b);
        System.out.println(a + "||"+b+"="+c);

        System.out.println("===== AND (&&) ====");
        a = false;
        b= false;
        c = (a&&b);
        System.out.println(a + "&&"+b+"="+c);
        a = false;
        b= true;
        c = (a&&b);
        System.out.println(a + "&&"+b+"="+c);
        a = true;
        b= false;
        c = (a&&b);
        System.out.println(a + "&&"+b+"="+c);
        a = true;
        b= true;
        c = (a&&b);
        System.out.println(a + "&&"+b+"="+c);

        System.out.println("===== XOR (^) ====");
        a = false;
        b= false;
        c = (a^b);
        System.out.println(a + "^"+b+"="+c);
        a = false;
        b= true;
        c = (a^b);
        System.out.println(a + "^"+b+"="+c);
        a = true;
        b= false;
        c = (a^b);
        System.out.println(a + "^"+b+"="+c);
        a = true;
        b= true;
        c = (a^b);
        System.out.println(a + "^"+b+"="+c);

        System.out.println("===== NEGASI (!) ====");
        a = true;
        c = !a;
        System.out.println(a + "-->(!)="+c);
        a = false;
        c = !a;
        System.out.println(a + "-->(!)="+c);
    }
}
