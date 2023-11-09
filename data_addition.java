package com.company;
class data_summation {
    private int a = 10;
    private int b = 10;
    private int c = 10;
    public int showA(){
        return this.a;
    }
    public int showB(){
        return this.b;
    }
    public int showC(){
        return this.c;
    }
    public void inputa(int nilai){
        this.a=nilai;
    }
    public void inputb(int nilai){
        this.b=nilai;
    }
    public void inputc(int nilai){
        this.c=nilai;
    }
    public int tambah(){
        int hasil = this.a+this.b+this.c;
        return hasil;
    }
    public int pengurangan(){
        int hasil = this.a-this.b-this.c;
        return hasil;
    }
    public int perkalian(){
        int hasil = this.a*this.b*this.c;
        return hasil;
    }
    public double pembagian(){
        double hasil = this.b/this.a;
        return hasil;
    }
}
public class data_addition {
    public static void main(String[] args){
        data_summation objku= new data_summation();
        System.out.println("Nilai A = " + objku.showA());
        System.out.println("Nilai B = " + objku.showB());
        System.out.println("Nilai C = " + objku.showC());
        objku.inputa(100);
        System.out.println("Nilai A after = " + objku.showA());
        objku.inputb(200);
        System.out.println("Nilai B after = " + objku.showB());
        objku.inputc(300);
        System.out.println("Nilai C after = " + objku.showC());
        System.out.println("hasil + = " + objku.tambah());
        System.out.println("hasil - = " + objku.pengurangan());
        System.out.println("hasil * = " + objku.perkalian());
        System.out.println("hasil / = " + objku.pembagian());
    }
}
