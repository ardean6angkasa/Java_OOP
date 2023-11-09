import java.util.*;
public class looping_values_and_count_total {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        method bilangan = new method();
        int y;
        int jml=0;

        for(y=0; y<=9;y+=1)
        {
            System.out.print("Masukkan 10 Bilangan Bulat: ");
            int bilbul = input.nextInt();
            bilangan.setNilai(bilbul);
            jml=jml+bilangan.getNilai();
            bilangan.setNilai1(jml);

        }

        System.out.print("Total jumlah: " + bilangan.getNilai1());
    }
}