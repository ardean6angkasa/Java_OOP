package com.company;

public class operator_additon {
    public static void main(String[] args){
        int variabel=5;
        int variabel2=3;
        int hasil;
        /* penjumlahan*/
        hasil = variabel+variabel2;
        System.out.println(variabel+"+"+variabel2+"="+hasil);
        /*pengurangan*/
        hasil = variabel-variabel2;
        System.out.printf("%d - %d = %d\n", variabel,variabel2,hasil);
        //perkalian
        hasil = variabel*variabel2;
        System.out.printf("%d x %d = %d\n", variabel,variabel2,hasil);
        //pembagian
        float hasilDivide = (float) variabel / variabel2;
        System.out.printf("%d : %d = %.2f\n", variabel, variabel2, hasilDivide);

        float a =6;
        float b= 5;
        float hasilfloat=a/b;
        System.out.println(a+"/"+b+"="+hasilfloat);
        //modulus
        float hasilModulus = (float) variabel%variabel2;
        System.out.printf("%d %% %d = %.2f\n", variabel,variabel2,hasilModulus);

    }
}
