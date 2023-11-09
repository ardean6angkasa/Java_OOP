import java.util.Scanner;

class Mymethod_6 {

    public double berat_badan;
    public double tinggi_badan;
    public double BMI_weight;

    public void setBerat_badan(double berat_badan) {
        this.berat_badan = berat_badan;
    }

    public void setTinggi_badan(double tinggi_badan) {
        this.tinggi_badan = tinggi_badan;
    }

    public void setBMI_weight(double BMI_weight) {
        this.BMI_weight = BMI_weight;
    }

    public double getBerat_badan() {
        return this.berat_badan;
    }

    public double getTinggi_badan() {
        return this.tinggi_badan;
    }

    public double getBMI_weight() {
        return this.BMI_weight;
    }
}

public class body_mass_index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mymethod_6 BMI = new Mymethod_6();

        System.out.print("Masukkan Berat Badan (kg): ");
        double weight = input.nextDouble();
        BMI.setBerat_badan(weight);

        System.out.print("Masukkan Tinggi Badan (cm): ");
        double heightInCm = input.nextDouble();
        double heightInM = heightInCm / 100.0;
        BMI.setTinggi_badan(heightInM);

        double rumus_BMI = BMI.getBerat_badan() / (BMI.getTinggi_badan() * BMI.getTinggi_badan());
        BMI.setBMI_weight(rumus_BMI);

        System.out.printf("BMI: %.2f%n", BMI.getBMI_weight());

        if (BMI.getBMI_weight() < 18.5) {
            System.out.println("Berat Badan Dinyatakan Underweight");
        } else if (BMI.getBMI_weight() >= 18.5 && BMI.getBMI_weight() <= 22.9) {
            System.out.println("Berat Badan Dinyatakan Ideal");
        } else if (BMI.getBMI_weight() > 22.9) {
            System.out.println("Berat Badan Dinyatakan Overweight");
        } else {
            System.out.println("Error");;
        }
    }
}
