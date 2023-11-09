abstract class HitungLuas {
    protected double s1;
    protected double s2;
    public void setSisi(double s1){
        this.s1=s1;
    }
    public void setSisi(double s1, double s2){
        this.s1=s1;
        this.s2=s2;
    }
    public double getS1(){
        return s1;
    }
    public double getS2(){
        return s2;
    }
    public abstract double getLuas();
}

class segitiga extends HitungLuas{
    public double getLuas(){
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}
class lingkaran extends HitungLuas{
    public double getLuas(){
        double r= this.s1/2;
        double luas=3.14*r*r;
        return luas;
    }
}

public class calculating_triangle_and_circle_shape {
    public static void main(String[] args){
        segitiga osegitiga=new segitiga();
        osegitiga.setSisi(50,2);
        System.out.println("Luas Segitiga = 0.5 x " + osegitiga.getS1() + " x " + osegitiga.getS2() + "\n= "+ osegitiga.getLuas());
        lingkaran oling = new lingkaran();
        oling.setSisi(140);
        System.out.println("Luas lingkaran= "+ oling.getLuas());
    }
}