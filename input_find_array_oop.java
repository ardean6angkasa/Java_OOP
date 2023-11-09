import java.util.*;
class myValue{
    public String A;
    public int[] B;
    public int C;
    public int D;
    public void setA(String A) {
        this.A = A;
    }
    public void setB(int[] B) {
        this.B = B;
    }
    public void setC(int C) {
        this.C = C;
    }
    public void setD(int D) {
        this.D = D;
    }
    public String getA() {
        return this.A;
    }
    public int[] getB() {
        return this.B;
    }
    public int getC() {
        return this.C;
    }
    public int getD() {
        return this.D;
    }
}
public class input_find_array_oop {
        static int dicari(int A[],int cari){
            for(int i=0; i<A.length; i++){
                if(A[i]==cari){
                    return i;
                }
            }
            return -1;
        }

        public static void main (String []   args){
            myValue bilangan = new myValue();
            Scanner cc = new Scanner(System.in);
            System.out.println("Masukkan 10 Bilangan Bulat");
            int A[] = new int[10];
            for (int i = 0; i < A.length; i++) {
                A[i] = cc.nextInt();
            }
            bilangan.setB(A);
            cc.nextLine();
            System.out.print("\n10 Bilangan Bulat Yang Telah Diinput: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(bilangan.getB()[i]);
                if (i < A.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            String answer="Yes";
            String answer1="No";
            if ((answer.equalsIgnoreCase("yes")) && (answer1.equalsIgnoreCase("no"))) {
                System.out.print("Apakah Anda Ingin Mencari Nilai Yang Telah Diinput (Yes or No)? ");
                String L = cc.nextLine();
                bilangan.setA(L);
                if ((bilangan.getA().equalsIgnoreCase(answer))) {
                    System.out.print("Masukkan Nilai Yang Mau Dicari: ");
                    int cari = cc.nextInt();
                    bilangan.setC(cari);
                    int elemen = dicari(bilangan.getB(), bilangan.getC());
                    bilangan.setD(elemen);
                    if (bilangan.getD() == -1) {
                        System.out.println("Error, Nilai Tidak Ditemukan");
                    } else {
                        System.out.println("Nilai " + bilangan.getC() +" Berhasil Ditemukan Pada Urutan Array (0-9) Ke-"+bilangan.getD());
                    }
                } else if ((bilangan.getA().equalsIgnoreCase(answer1))) {
                    System.out.print("Makasih");
                } else {
                    System.out.println("Error");
                }
            }
        }
}