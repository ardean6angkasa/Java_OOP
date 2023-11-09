interface luas{
    public void setsisi(double...sisi);
    public double getluas();
}
class luassegitiga implements luas{
    private double alas;
    private double tinggi;
    @Override
    public void setsisi(double...sisi){
        this.alas=sisi[0];
        this.tinggi=sisi[1];
    }
    @Override
    public double getluas(){
        double luas = 0.5*this.alas*this.tinggi;
        return luas;
    }
    public  double getalas(){
        return this.alas;
    }
    public double gettinggi(){
        return this.tinggi;
    }
}
public class calculating_triangle_shape {
    public static void main(String[] args){
        luassegitiga ls = new luassegitiga();
        ls.setsisi(5,10);
        System.out.println("Luas Segitiga=0.5 x " + ls.getalas()+ " x " + ls.gettinggi()+" = "+ ls.getluas());
    }
}
