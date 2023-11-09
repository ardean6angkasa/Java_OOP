import java.io.*;
public class function_find_file {


        public static void findFile() throws IOException {

            // code that may generate IOException
            // this is the function to find a file
            File newFile = new File("D:\\java\\src\\com\\company\\codingan sistem basis data.txt");
            FileInputStream stream = new FileInputStream(newFile);
//            throw new IOException("File not found");
        }

        public static void main(String[] args) {
            try {
                findFile();
                System.out.println("File found");
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }
    }

