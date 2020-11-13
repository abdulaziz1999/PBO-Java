import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings("unchecked")

public class Tabungan {
    public static void main(String[] args) {
        String nama,pilihan;
        int saldo,saldotambah,saldokurang,tambahSaldo,tarikSaldo;

        // membuat objek array list
        ArrayList tabungan = new ArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan Nama Anda : ");
        nama = scan.nextLine();
        tabungan.add(nama);

        System.out.println("Masukan Saldo Anda : ");
        saldo = scan.nextInt();
        tabungan.add(saldo);
        scan.nextLine();
        
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("Menu BANK Java Program");
        System.out.println("A. tulis 'tambah' untuk menambah tabungan ");
        System.out.println("B. tulis 'tarik' untuk penarikan tabungan");
        System.out.println("C. tulis 'keluar' untuk menghentikan transaksi");
        System.out.println("----------------------------------------------");
        System.out.print("Pilihan mu : ");
        System.out.println("");
        pilihan = scan.nextLine();

        switch (pilihan.toLowerCase()){
            case "tambah":
                System.out.println("----------------------------------------------");
                System.out.println("Masukan nominal yang akan ditambahkan : ");
                System.out.println("----------------------------------------------");
                tambahSaldo = scan.nextInt();
                saldotambah = tambah(saldo,tambahSaldo);
                tabungan.remove(1);
                tabungan.add(saldotambah);
                System.out.println("Info Saldo Nasabah : "+tabungan.get(0));
                System.out.println("Saldo Anda Sekarang : "+tabungan.get(1));
                break;
            case "tarik":
                System.out.println("----------------------------------------------");
                System.out.println("Masukan nominal yang akan ditarik : ");
                System.out.println("----------------------------------------------");
                tarikSaldo = scan.nextInt();
                saldokurang = tarik(saldo,tarikSaldo);
                tabungan.remove(1);
                tabungan.add(saldokurang);
                System.out.println("Info Saldo Nasabah : "+tabungan.get(0));
                System.out.println("Saldo Anda Sekarang : "+tabungan.get(1));
                break;
            case "keluar":
                System.out.println("Terima kasih");
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
                break;
        }

    }

    public static int tambah(int saldo,int tambahSaldo){
        int hasilTambah = saldo + tambahSaldo;

        return hasilTambah;
    }

    public static int tarik(int saldo,int tarikSaldo){
        int hasilTarik = saldo - tarikSaldo;

        return hasilTarik;
    }
}