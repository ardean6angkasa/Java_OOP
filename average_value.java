import java.util.Scanner;

class Mymethod_2 {
    public int A;
    public int B;
    public int C;
    public double D;

    public void setA(int A) {
        this.A = A;
    }

    public void setB(int B) {
        this.B = B;
    }

    public void setC(int C) {
        this.C = C;
    }
    public void setD(double D) {
        this.D = D;
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
    public double getD() {
        return this.D;
    }
}


public class average_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mymethod_2 rata_rata = new Mymethod_2();

        System.out.print("A: ");
        int A = input.nextInt();
        rata_rata.setA(A);

        System.out.print("B: ");
        int B = input.nextInt();
        rata_rata.setB(B);

        System.out.print("C: ");
        int C = input.nextInt();
        rata_rata.setC(C);

        int total=3;
        rata_rata.setD(total);

        System.out.print("\n");
        System.out.print("\nA= "+rata_rata.getA());
        System.out.print("\nB= "+rata_rata.getB());
        System.out.print("\nC= "+rata_rata.getC());
        System.out.print("\nPenjumlahan= "+(rata_rata.getA()+rata_rata.getB()+rata_rata.getC()));
        System.out.print("\nRata-Rata= "+(rata_rata.getA()+rata_rata.getB()+rata_rata.getC())/rata_rata.getD());
    }
}
