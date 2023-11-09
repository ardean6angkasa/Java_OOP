import java.util.Scanner;

class divide {
    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void hasil() {
        double hasil = 0;
        try {
            hasil = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e);
        }
        System.out.println("hasil = " + hasil);
    }
}

public class dividing_data {
    public static void main(String[] args) {
        divide bil = new divide();
        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        System.out.print("Masukkan bilangan 1: ");
        a = sc.nextDouble();
        bil.setA(a);

        System.out.print("Masukkan bilangan 2: ");
        b = sc.nextDouble();
        bil.setB(b);

        bil.hasil();
        System.out.println("Terima Kasih");
    }
}
