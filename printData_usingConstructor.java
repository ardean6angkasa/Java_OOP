class main1 {
    String nama;
    String NIM;
    String jurusan;
    main1(String inputNama, String inputNIM,String inputjurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputjurusan;
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}
public class printData_usingConstructor {
    public static void main (String[] args) throws Exception{
        main1 constructor1 = new main1("ucup","234234234","arsitektur");
        main1 constructor2 = new main1("otong", "3243243232","desain komunikasi visual");
    }

}
