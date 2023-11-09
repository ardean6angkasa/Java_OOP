import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Employee {
    private int gajiPokok;
    private int tunjangan;
    private int jamLembur;
    public Employee(int gajiPokok, int tunjangan) {
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    public int hitungGaji(int jamKerja) {
        int totalGaji = gajiPokok + tunjangan;
        jamLembur = Math.max(0, jamKerja - 173);
        int gajiLembur = jamLembur * 20000;
        totalGaji += gajiLembur;
        double pajak = totalGaji * 0.005;
        double gajiKaryawan = totalGaji - pajak;
        return (int) gajiKaryawan;
    }

    public int getJamLembur() {
        return jamLembur;
    }

    public int getGajiLembur() {
        return jamLembur * 20000;
    }
}

public class employee_salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Golongan (1/2/3/4): ");
        int golongan = input.nextInt();

        if (golongan >= 1 && golongan <= 4) {
            int gajiPokok, tunjangan;
            switch (golongan) {
                case 1:
                    gajiPokok = 1486500;
                    tunjangan = 250000;
                    System.out.println("Gaji Pokok: Rp. 1.486.500\nTunjagan: Rp. 250.000");
                    break;
                case 2:
                    gajiPokok = 1926000;
                    tunjangan = 300000;
                    System.out.println("Gaji Pokok: Rp. 1.926.000\nTunjagan: Rp. 300.000");
                    break;
                case 3:
                    gajiPokok = 2456700;
                    tunjangan = 350000;
                    System.out.println("Gaji Pokok: Rp. 2.456.700\nTunjagan: Rp. 350.000");
                    break;
                case 4:
                    gajiPokok = 2899500;
                    tunjangan = 400000;
                    System.out.println("Gaji Pokok: Rp. 2.899.500\nTunjagan: Rp. 400.000");
                    break;
                default:
                    gajiPokok = 0;
                    tunjangan = 0;
            }

            Employee employee = new Employee(gajiPokok, tunjangan);

            System.out.print("Jam Kerja: ");
            int jamKerja = input.nextInt();
            int gajiKaryawan = employee.hitungGaji(jamKerja);

            NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
            System.out.println("Total Jam Lembur: " + employee.getJamLembur());
            System.out.println("Gaji Lembur Karyawan: Rp. " + nf.format(employee.getGajiLembur()));
            System.out.println("Gaji Karyawan: Rp. " + nf.format(gajiKaryawan));
        } else {
            System.out.println("Invalid golongan");
        }
    }
}
