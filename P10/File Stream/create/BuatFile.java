import java.io.File;
import java.io.IOException;

public class BuatFile{
    public static void main(String [] args){
        try{

            File buat = new File("../file/file2.txt");

            if(buat.createNewFile()){
                System.out.println("Nama File adalah = " + buat.getName());
            }else{
                System.out.println("File sudah dibuat");
            }

        } catch (IOException e){
                System.out.println("Terdapat error pada file");
        }
    }
}