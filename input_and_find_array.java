import java.util.*;
public class input_and_find_array {
    public static void main (String [] args){
        Scanner cc=new Scanner(System.in);
        System.out.println("masukkan nilai array");
        int A[]=new int[10];
        for (int i=0; i<A.length; i++){
            A[i] = cc.nextInt();
        }
        System.out.println("nilai elemen array adalah : ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i]);
            if (i < A.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("masukkan nilai yang di cari");
        int find_number = cc.nextInt();
        for(int i=0; i<A.length; i++){
            if(A[i] == find_number){
                System.out.println("nilai " + find_number + ", ditemukan di  elemen ke-" + i);
            }
        }

    }
}