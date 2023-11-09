public class create_class_with_constructor_2 {
    int x;
    public create_class_with_constructor_2(int y){
        x=y;
    }
    public static void main(String[]args){
        create_class_with_constructor_2 myobj=new create_class_with_constructor_2(25);
        System.out.println(myobj.x);
    }
}