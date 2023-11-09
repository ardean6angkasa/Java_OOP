public class index_out_of_bound_exception {
    public static  void main(String[] args){
        try {
            int b[]={20,20,40};
            System.out.println("Nilai: " + b[2]);
            double angka = 2;
            double hasil = angka/2;

            if (Double.isInfinite(hasil) || Double.isNaN(hasil)) {
                System.out.println("Tidak dapat membagi sebuah bilangan dengan nilai 0");
                System.out.println("Pesan Tidak Diterima");
            } else {
                System.out.println("hasil: " + hasil);
                System.out.println("Pesan Diterima");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught array index out of bound: " + e.getMessage());
            System.out.println("Pesan Tidak Diterima");
        }
    }
}