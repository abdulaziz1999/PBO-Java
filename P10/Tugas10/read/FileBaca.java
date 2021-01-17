import java.io.File;

public class FileBaca{
    public static void main(String [] args){
            File informasiFile = new File("../file/DataMahasiswa.txt");
            if(informasiFile.exists()){
                System.out.println("Nama File : " + informasiFile.getName());
                System.out.println("Alamat File : " + informasiFile.getAbsolutePath());
                System.out.println("Apakah File bisa ditulis : " + informasiFile.canWrite());
                System.out.println("Apakah File data bisa dibaca : " + informasiFile.canRead());
                System.out.println("Ukuran File : " + informasiFile.length());
            }else{
                System.out.println("File Tidak ada");
            }

           
    }
}