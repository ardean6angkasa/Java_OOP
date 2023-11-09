public class method_void {
    public static void main (String[] args){
        System.out.println(simpel());
        fungsiVoid("apa pun");
        selamatPagi("enak");
        selamatPagi("abah");
    }
    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi " + nama);
    }
    private static void fungsiVoid (String input){
        System.out.println(input);
    }
    private static float simpel(){
        return 10.0f;
    }
}