public class basic_try_catch_2 {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[9] = 30 / 2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
