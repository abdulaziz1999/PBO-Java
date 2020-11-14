import java.util.Scanner;
import java.util.ArrayList;

public class LatihanTabungan{

        public static void main(String args []){
            int tawal,tambahTabungan,kurangTabungan,hasiltambah,hasilkurang;
            String nama,pilihan;
            Scanner scan = new Scanner(System.in);

            System.out.print("Masukan Nama Anda : ");
            nama = scan.nextLine();

            System.out.print("Masukan Tabungan Anda : ");
            tawal = scan.nextInt();
            scan.nextLine();

            System.out.println("Mau Melakukan Transaksi ?");
            System.out.println("A. tulis 'tambah' untuk melakukan menambah tabungan");
            System.out.println("B. tulis 'kurang' untuk melakukan mengurangi tabungan");
            System.out.println("Pilihan mu : ");
            pilihan = scan.nextLine();

            switch (pilihan.toLowerCase()){
                case "tambah":
                    System.out.println("Masukan Nominal : ");
                    tambahTabungan = scan.nextInt();
                    hasiltambah = pertambahan(tawal,tambahTabungan);
                    System.out.println("Tabungan Anda Bertambah : "+hasiltambah);
                    break;
                case "kurang":
                    System.out.println("Masukan Nominal : ");
                    kurangTabungan = scan.nextInt();
                    hasilkurang = pengurangan(tawal,kurangTabungan);
                    System.out.println("Tabungan Anda Berkurang : "+hasilkurang);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            } 
        }

        public static int pertambahan(int nilai1, int nilai2){
            int jumlah = nilai1+nilai2;

            return jumlah;
        }

        public static int pengurangan(int nilai1, int nilai2){
            int jumlah = nilai1-nilai2;

            return jumlah;
        }
}