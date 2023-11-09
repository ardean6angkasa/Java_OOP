import java.util.*;

class Mymethod_3 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int [] H;

    public void setA(int A) {
        this.A = A;
    }

    public void setB(int B) {
        this.B = B;
    }
    public void setC(int C) {
        this.C = C;
    }

    public void setD(int D) {
        this.D = D;
    }
    public void setE(int E) {
        this.E = E;
    }
    public void setH(int[] H) {
        this.H = H;
    }

    public int getA() {
        return this.A;
    }

    public int getB() {
        return this.B;
    }
    public int getC() {
        return this.C;
    }

    public int getD() {
        return this.D;
    }
    public int getE() {
        return this.E;
    }
    public int[] getH() {
        return this.H;
    }
}


public class max_and_min_value {
public static void main(String[] args) {
        int maksimum, minimum, i;
        int[] array;
        Scanner scan = new Scanner(System.in);
        Mymethod_3 bilangan = new Mymethod_3();
        array = new int[3];
    for (i = 0; i < array.length; i++) {
        System.out.print("Nilai ke-"+(i+1)+": " );
        array[i] = scan.nextInt();
        }
    bilangan.setH(array);
    maksimum = bilangan.getH()[0];
    for(i = 0; i < array.length; i++) {
        if (bilangan.getH()[i] > maksimum){
            maksimum = bilangan.getH()[i];

        }
    }
    System.out.println("Nilai maksimum adalah "+maksimum);
        minimum = bilangan.getH()[0];

        for(i = 0; i < array.length; i++) {
        if (bilangan.getH()[i] < minimum){
        minimum = bilangan.getH()[i];

        }
        }
        System.out.println("Nilai minimum adalah "+minimum);
 }
}