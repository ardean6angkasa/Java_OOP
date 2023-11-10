
import java.util.Scanner;
class myClass2 {
    private long nim;
    private String namalengkap;
    private String jurusan;
    private int angkatan;

    public void setNim(long nim){
        this.nim = nim;
    }

    public void setNamalengkap(String namalengkap){
        this.namalengkap = namalengkap;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setAngkatan(int angkatan){
        this.angkatan = angkatan;
    }

    public long getNim(){
        return this.nim;
    }

    public String getNamalengkap(){
        return this.namalengkap;
    }
    public String getJurusan(){
        return this.jurusan;
    }
    public int getAngkatan(){
        return this.angkatan;
    }
}


public class college_student_biodata {
    public static void main(String[] args) {
        myClass2 input = new myClass2();
        Scanner userInput = new Scanner(System.in);

        System.out.print("NIM: ");
        long nim = userInput.nextLong();
        userInput.nextLine();
        input.setNim(nim);

        System.out.print("Nama lengkap: ");
        String namalengkap = userInput.nextLine();
        input.setNamalengkap(namalengkap);

        System.out.print("Jurusan: ");
        String jurusan = userInput.nextLine();
        input.setJurusan(jurusan);

        System.out.print("Angkatan: ");
        int angkatan = userInput.nextInt();
        input.setAngkatan(angkatan);

        System.out.print("\n");
        System.out.println("|===============BIODATA MAHASISWA==================|");
        System.out.println("            NIM: " + input.getNim());
        System.out.println("            Nama Lengkap: " + input.getNamalengkap());
        System.out.println("            Jurusan: " + input.getJurusan());
        System.out.println("            Angkatan: " + input.getAngkatan());
        System.out.print("|==================================================|");
    }
}
