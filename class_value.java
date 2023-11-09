package com.company;

class myClass {
    public int x = 5;
    int y = 15;
    private int z = 20;
    public int showZ(){
        return this.z;
    }
}

public class class_value {
    public static void main(String[] args){
        myClass objku= new myClass();
        System.out.println(objku.x);
        System.out.println(objku.y);
        System.out.println(objku.showZ());

    }
}
