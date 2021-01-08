import java.io.FileWriter;
import java.io.IOException;

public class TulisFile{
    public static void main(String [] args){
        try{

            FileWriter tulis = new FileWriter("../file/file1.txt");
            tulis.write("File coding 1 \n");
            tulis.write("File coding 2 \n");
            tulis.write("File coding 3");
            tulis.close();

        } catch(IOException e){
                System.out.println("Terdapat error pada file");
        }
    }
}