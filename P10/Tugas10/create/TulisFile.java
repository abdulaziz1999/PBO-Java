import java.io.FileWriter;
import java.io.IOException;

public class TulisFile{
    public static void main(String [] args){
        try{

            FileWriter tulis = new FileWriter("../file/DataMahasiswa.txt");
            tulis.write("Abdul Aziz \n");
            tulis.write("Miftah Fauzi \n");
            tulis.write("Rosyid Munawar");
            tulis.close();
 
        } catch(IOException e){
                System.out.println("Terdapat error pada file");
        }
    }
}