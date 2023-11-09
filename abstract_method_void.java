abstract class abstract_method_void{
    public String fname="john";
    public int age=24;
    public abstract void study();
}
class Student extends abstract_method_void{
    public int graduationYear=2018;
    public void study(){
        System.out.println("Studying all day along");
    }
}

