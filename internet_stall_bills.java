import java.util.Scanner;

class Mymethod_4 {
    public int nilai;
    public double Internet;
    public double Pengetikan;
    public double GameOnline;
    public int ScanFile;
    public int PrintColor;
    public int PrintMonoChrome;
    public int TehBotol;

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public void setInternet(double Internet) {
        this.Internet = Internet;
    }

    public void setTehBotol(int TehBotol) {
        this.TehBotol = TehBotol;
    }

    public void setPengetikan(double Pengetikan) {
        this.Pengetikan = Pengetikan;
    }

    public void setGameOnline(double GameOnline) {
        this.GameOnline = GameOnline;
    }

    public void setPrintColor(int PrintColor) {
        this.PrintColor = PrintColor;
    }

    public void setPrintMonoChrome(int PrintMonoChrome) {
        this.PrintMonoChrome = PrintMonoChrome;
    }

    public void setScanFile(int ScanFile) {
        this.ScanFile = ScanFile;
    }

    public int getNilai() {
        return this.nilai;
    }

    public double getInternet() {
        return this.Internet;
    }

    public int getTehBotol() {
        return this.TehBotol;
    }

    public double getPengetikan() {
        return this.Pengetikan;
    }

    public double getGameOnline() {
        return this.GameOnline;
    }

    public int getPrintColor() {
        return this.PrintColor;
    }

    public int getPrintMonoChrome() {
        return this.PrintMonoChrome;
    }

    public int getScanFile() {
        return this.ScanFile;
    }
}


public class internet_stall_bills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mymethod_4 pemakaian = new Mymethod_4();

        System.out.print("Lama Pemakaian Komputer Untuk Internet: ");
        double internet = input.nextDouble();
        if (internet == 0) {
            double biaya= 0;
            pemakaian.setInternet(biaya);
        } else if (internet <= 30) {
            double biaya= 2000;
            pemakaian.setInternet(biaya);
        } else{
            double biaya = (internet/60)*4000;
            pemakaian.setInternet(biaya);
        }

        System.out.print("Lama Pemakaian Komputer Untuk Pengetikan: ");
        double pengetikan = input.nextDouble();
        if (pengetikan == 0) {
            double biaya1 = 0;
            pemakaian.setPengetikan(biaya1);
        } else if (pengetikan <= 30){
            double biaya1 = 1000;
            pemakaian.setPengetikan(biaya1);
        } else {
            double biaya1 = (pengetikan/ 60) * 2000;
            pemakaian.setPengetikan(biaya1);
        }

        System.out.print("Lama Pemakaian Komputer Untuk Game Online: ");
        double gameonline = input.nextDouble();
        if (gameonline == 0){
            double biaya2 = 0;
            pemakaian.setGameOnline(biaya2);
        } else if (gameonline <= 30) {
            double biaya2 = 2500;
            pemakaian.setGameOnline(biaya2);
        } else{
            double biaya2 = (gameonline / 60) * 5000;
            pemakaian.setGameOnline(biaya2);
        }

        System.out.print("Scan File: ");
        int scan = input.nextInt();
        int biaya3 = scan*1000;
        pemakaian.setScanFile(biaya3);

        System.out.print("Print Warna: ");
        int printcolor = input.nextInt();
        int biaya4 = printcolor *500;
        pemakaian.setPrintColor(biaya4);

        System.out.print("Print Hitam-Putih: ");
        int print = input.nextInt();
        int biaya5 = print*300;
        pemakaian.setPrintMonoChrome(biaya5);

        System.out.print("Teh Botol: ");
        int tehbtl = input.nextInt();
        int biaya6 = tehbtl*3000;
        pemakaian.setTehBotol(biaya6);

        System.out.print("\n");
        System.out.println("Tagihan Warnet");
        System.out.printf("Pemakaian Komputer Untuk Internet: Rp. %.2f %n",pemakaian.getInternet());
        System.out.printf("Pemakaian Komputer Untuk Pengetikan: Rp. %.2f %n",pemakaian.getPengetikan());
        System.out.printf("Pemakaian Komputer Untuk Game Online: Rp. %.2f %n",pemakaian.getGameOnline());
        System.out.print("\nBiaya Scan File: Rp. "+pemakaian.getScanFile());
        System.out.print("\nBiaya Print Warna: Rp. "+pemakaian.getPrintColor());
        System.out.print("\nBiaya Scan Hitam Putih: Rp. "+pemakaian.getPrintMonoChrome());
        System.out.print("\nBiaya Teh Botol: Rp. "+pemakaian.getTehBotol());
        System.out.printf("\n\nTotal: Rp. %.2f %n",(pemakaian.getInternet()+pemakaian.getPengetikan()+pemakaian.getGameOnline()+pemakaian.getScanFile()+pemakaian.getPrintColor()+pemakaian.getPrintMonoChrome()+pemakaian.getTehBotol()));
    }
}
