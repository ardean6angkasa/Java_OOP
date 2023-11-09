public class basic_do_while_using_if {
    public static void main(String[] args) {
        System.out.println("ini adalah awal program");
        int a=0;
        boolean kondisi=true;
        do{
            a++;
            System.out.println("do while ke-" + a);
            if (a==6){
                kondisi=false;
            }
        }while(kondisi);
        System.out.println("ini adalah akhir program");
    }
}