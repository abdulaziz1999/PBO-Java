import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BacaFile{
    public static void main(String [] args){
        try{
            File baca = new File("../file/DataMahasiswa.txt");
            Scanner bacaFile = new Scanner(baca);

            while(bacaFile.hasNextLine()){
                System.out.println(bacaFile.nextLine());
            }

        } catch(FileNotFoundException e){
                System.out.println("File tidak di temukan");
        }
    }
} 
