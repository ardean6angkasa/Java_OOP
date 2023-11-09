public class nestedexception {
    public static void main(String[] args){
        try {
            try {
                try {
                    int arrBil [] ={1,2,3,4};
                    System.out.println(arrBil[6]);
                } catch (ArithmeticException e){
                    System.out.print("Arithmetic Exception ");
                    System.out.println(" ditangani pada try-block3");
                }
                int result = 5 / 0;
            } catch (ArithmeticException e) {
                System.out.print("Arithmetic Exception");
                System.out.println("ditangani pada try-block2");
            }
        } catch (ArithmeticException e){
            System.out.print("Arithmetic Exception");
            System.out.println(" ditangani pada main try-block");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.print("ArrayIndexOutOfBounds Exception");
            System.out.println(" ditangani pada main try-block");
        } catch (Exception e){
            System.out.print("Exception ");
            System.out.println(" ditangani pada main try-block");
        }
    }
}
