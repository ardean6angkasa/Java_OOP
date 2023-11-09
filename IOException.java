import java.io.*;
public class IOException {
    public static void main(String[] args) {

        String sukasukasaya[]={"Angkasa","Reza","Pantera"};
        int terserahsaya[]={700,800,900};
        try
        {
            RandomAccessFile contohsj = new RandomAccessFile
                    ("tes saja untuk file txt.txt","rw");
            for(int i=2;i<3;i++)
            {
                contohsj.writeUTF(sukasukasaya[i]);
                contohsj.writeInt(terserahsaya[i]);
            }
            contohsj.seek(5);
            System.out.println(contohsj.readUTF()+" "+contohsj.readInt());
            System.out.println(contohsj.readUTF()+ " "+contohsj.readInt());
            contohsj.close();

        }
        catch(java.io.IOException e)
        {
            System.out.println("Indeks melebihi batas atau kelebihan, pos coba dikembalikan ke 0 untuk memperbaiki error ini");
        }
        System.out.println("Akhir Program atau End Of program, Thank You");
    }
}