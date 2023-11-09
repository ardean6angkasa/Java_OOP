import java.util.Scanner;
class Mymethod {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;

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

}

public class sum_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mymethod penjumlahan = new Mymethod();

        System.out.print("A: ");
        int A = input.nextInt();
        penjumlahan.setA(A);

        System.out.print("B: ");
        int B = input.nextInt();
        penjumlahan.setB(B);

        System.out.print("C: ");
        int C = input.nextInt();
        penjumlahan.setC(C);

        System.out.print("\n");
        System.out.print("\nA= " + penjumlahan.getA());
        System.out.print("\nB= " + penjumlahan.getB());
        System.out.print("\nC= " + penjumlahan.getC());
        System.out.print("\nPenjumlahan= " + (penjumlahan.getA() + penjumlahan.getB() + penjumlahan.getC()));
    }

}