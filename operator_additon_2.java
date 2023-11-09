package com.company;

public class operator_additon_2 {
    public static void main(String[] args){
        int nilaiInt=256;
        System.out.println("nilai int = " + nilaiInt);
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);
        byte nilaiByte=(byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);
        float a = 10;
        int b =4;
        float c = a/b;
        System.out.printf("%f / %d=%f\n",a,b,c);
        int f = 10;
        int g =4;
        float t = (float) f/g;
        System.out.printf("%d / %d=%f\n",f,g,t);
    }
}
