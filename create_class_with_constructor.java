public class create_class_with_constructor {
    int x;
    public create_class_with_constructor(){
        x=15;
    }
    public static void main(String[]args){
        create_class_with_constructor myobj=new create_class_with_constructor();
        System.out.println(myobj.x);
    }
}