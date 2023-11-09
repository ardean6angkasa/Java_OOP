public class basic_object_3 {
    int x = 5;
    public static void main(String[] args){
        basic_object myObj1= new basic_object();
        basic_object myObj2= new basic_object();
        myObj2.x=25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}