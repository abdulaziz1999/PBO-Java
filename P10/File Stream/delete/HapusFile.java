import java.io.File;

public class HapusFile{
    public static void main(String [] args){
            File hapus = new File("../file/file2.txt");
            if(hapus.delete()){
                System.out.println("Nama File : " + hapus.getName() + " Telah dihapus");
            }else{
                System.out.println("File Tidak ada, jadi tidak ada yang dihapus");
            }
    }
}