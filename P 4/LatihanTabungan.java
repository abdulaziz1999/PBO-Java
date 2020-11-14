import java.util.Scanner;
import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class LatihanTabungan{

        public static void main(String args []){
            int tawal,tambahTabungan,kurangTabungan,hasiltambah,hasilkurang,hasilArrayTambah;
            String nama,pilihan;
            Scanner scan = new Scanner(System.in);

            ArrayList ArrayTabungan = new ArrayList();
            // ArrayTabungan.add("aziz");
            // ArrayTabungan.add(100000);

            System.out.print("Masukan Nama Anda : ");
            nama = scan.nextLine();
            ArrayTabungan.add(nama);

            System.out.print("Masukan Tabungan Anda : ");
            tawal = scan.nextInt();
            ArrayTabungan.add(tawal);
            scan.nextLine();

            // System.out.println(ArrayTabungan);
            // System.out.println(ArrayTabungan.remove(1));
            // System.out.println(ArrayTabungan.add(15000));
            // System.out.println(ArrayTabungan);

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
                    ArrayTabungan.remove(1);
                    ArrayTabungan.add(hasiltambah);
                    System.out.println("Tabungan Anda Bertambah : "+ArrayTabungan.get(1));
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