import java.util.Scanner;
class myClass_student {
    private String namalengkap;
    private int umur;
    public myClass_student() {
        this.namalengkap= "";
        this.umur= 0;
    }


    public void setNamalengkap(String namalengkap){
        this.namalengkap = namalengkap;

    }
    public void setUmur(int umur){
        this.umur = umur;

    }

    public String getNamalengkap(){
        return this.namalengkap;
    }


    public int getUmur(){
        return this.umur;
    }
}
class employee extends myClass_student{
    private String nip;
    private String jabatan;
    public employee() {
        this.nip= "";
        this.jabatan= "";
    }


    public void setNip(String nip){
        this.nip = nip;

    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;

    }

    public String getNip(){
        return this.nip;
    }


    public String getJabatan(){
        return this.jabatan;
    }
}

public class basic_biodata_user {
    public static void main(String[] args) {
        myClass_student input = new myClass_student();
        Scanner userInput=new Scanner(System.in);
        System.out.print("Nama lengkap: ");
        String namalengkap = userInput.nextLine();
        input.setNamalengkap(namalengkap);
        System.out.print("Umur: ");
        int umur = userInput.nextInt();
        input.setUmur(umur);
        System.out.print("\n");
        System.out.println("|===============BIODATA MAHASISWA===============|");
        System.out.println("            Nama: " + input.getNamalengkap());
        System.out.println("            Umur: " + input.getUmur());
        System.out.print("|===============================================|\n\n ");
        employee input1 = new employee();
        Scanner Input = new Scanner(System.in);
        System.out.print("Nomor Induk Pegawai: ");
        String nip = Input.nextLine();
        input1.setNip(nip);
        System.out.print("Jabatan: ");
        String jabatan = Input.nextLine();
        input1.setJabatan(jabatan);
        System.out.print("\n");
        System.out.println("|===============BIODATA PEGAWAI===============|");
        System.out.println("            NIP: " + input1.getNip());
        System.out.println("            Jabatan: " + input1.getJabatan());
        System.out.print("|===============================================|");
    }
}
