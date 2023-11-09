public class basic_tryCatch_ifElse {
    public static void main(String[] args) {
        try {
            int umur = 20;
            if (umur < 18) {
                throw new ArithmeticException("Acces Denied");
            } else {
                System.out.println("Access Granted");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
