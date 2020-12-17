import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        // membuat variabel dan Scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Nama : ");
        nama = scan.nextLine();
        System.out.print("Nilai PBO : ");
        nilai = scan.nextInt();

        // cek Grade dari nilai yang di input
        if(nilai <= 100 && nilai >= 71){
            System.out.println("Selamat " + nama + " Grade : A");
        }else if(nilai <= 70 && nilai >= 51){
            System.out.println("Selamat " + nama + " Grade : B");
        }else if(nilai <= 50 && nilai >= 31){
            System.out.println("Selamat " + nama + " Grade : C");
        }else if(nilai <= 30){
            System.out.println("Selamat " + nama + " Grade : D");
        }

    }

}