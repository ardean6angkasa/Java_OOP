package com.company;
class main0{
    String nama;
    String NIM;
    main0(String nama, String NIM){
        this.nama=nama;
        this.NIM=NIM;
    }
    void show(){
        System.out.println("Nama : "+this.nama);
        System.out.println("NIM : "+this.NIM);
    }
    void setNama(String nama){
        this.nama=nama;
    }
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }
    String sayHi(String message){
        return message+" juga, nama saya adalah "+this.nama;
    }
}
public class basic_method_8 {
    public static void main(String[]args){
        main0 method= new main0("ucup","21312315325");
        method.show();
        method.setNama("tutungy");
        method.show();
        System.out.println(method.getNama());
        System.out.println(method.getNIM());
        String data = method.sayHi("ganteng");
        System.out.println(data);
    }
}
