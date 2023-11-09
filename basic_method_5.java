public class basic_method_5 {
    static void checkAge(int age) {
        if (age<18){
            System.out.println("Access denied - You Are Not Old Enough");
        } else{
            System.out.println("Access Granted - You Are Old Enough!");
        }
    }
    public static void main(String[]args){
        checkAge(20);
    }
}