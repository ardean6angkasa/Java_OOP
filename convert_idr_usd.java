import java.util.Scanner;

class Mymethod_5 {
    public int rupiah;
    public double konversi;
    public int nilai;

    public void setRupiah(int rupiah) {
        this.rupiah = rupiah;
    }

    public void setKonversi(double konversi) {
        this.konversi = konversi;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public int getRupiah() {
        return this.rupiah;
    }

    public double getKonversi() {
        return this.konversi;
    }

    public int getNilai() {
        return this.nilai;
    }
}

public class convert_idr_usd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mymethod_5 perhitungan = new Mymethod_5();

        System.out.print("Masukkan nilai Rupiah yang ingin dikonversikan ke US dolar: Rp.");
        int nilai_tukar_rupiah = input.nextInt();
        perhitungan.setRupiah(nilai_tukar_rupiah);

        int nilai_usd = 14591;
        double dolar = perhitungan.getRupiah() / (double)nilai_usd;
        perhitungan.setKonversi(dolar);

        System.out.printf("Konversi nilai Rupiah ke US dolar = %.2f US dolar %n", (perhitungan.getKonversi()));
    }
}
