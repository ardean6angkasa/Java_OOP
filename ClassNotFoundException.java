public class ClassNotFoundException {
    public static void main(String[] args) {
        try{
            String[] tes_tes_saja = new String[3];
            tes_tes_saja[0] = "Pantera Is Grimmjow";
            tes_tes_saja[1] = "Bruce Wayne Is Batman";
            tes_tes_saja[2] = "Billy Batson Is Shazam";
            System.out.println(tes_tes_saja[3]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Class Yang Ingin Ditampilkan atau Dicari Tidak Ada atau Tidak Tersedia");
        }
    }
}




