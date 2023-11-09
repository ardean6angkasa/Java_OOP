public class create_class_with_constructor_3 {
    int modelYear;
    String modelName;
    public create_class_with_constructor_3(int year, String name){
        modelYear=year;
        modelName=name;
    }
    public static void main(String[]args){
        create_class_with_constructor_3 mycar=new create_class_with_constructor_3(1969,"mustang");
        System.out.println(mycar.modelYear+ " "+mycar.modelName);
    }
}