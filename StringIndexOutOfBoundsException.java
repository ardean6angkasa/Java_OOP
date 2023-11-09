public class StringIndexOutOfBoundsException {
    public static void main(String[] args) {
        double nilai_terserah=10;
        String kumpulan[]={"a","b","c","d","e","f","g","h","i","j","k"};
        try
        {
            System.out.println(nilai_terserah/7);

            System.out.println(kumpulan[11]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Aritmatika Error Ada Yang Salah");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out Of Bounds");
        }
        catch(Exception e)
        {
            System.out.println("End Of Program");
        }
    }
}