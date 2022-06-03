import java.util.Scanner;
class Kalkulator{

    public static void main(String args []){
        Scanner scan =new Scanner(System.in);
        Aritmatika perhitungan = new Aritmatika();
        Statistika statistika = new Statistika();

        // int nil1 ,nil2,pertambahan,pengurangan,modulo;
        // nil1 = 10;
        // nil2 = 5;

        // pertambahan = perhitungan.pertambahan(nil1,nil2);
        // pengurangan = perhitungan.pengurangan(nil1,nil2);
        // modulo      = perhitungan.modulo(nil1,nil2);

        // //Print pertambahan Dan Pengurangan
        // System.out.println("Hasil pertambahan : "+pertambahan);
        // System.out.println("Hasil pengurangan : "+pengurangan);
        // System.out.println("Hasil modulo : "+modulo);

        // //Print Hasil Perkalian dan Pembagian
        // perhitungan.perkalian(nil1,nil2);
        // perhitungan.pembagian(nil1,nil2);
        
        System.out.println("1. menghitung nilai modus");
        System.out.println("2. menghitung nilai median");
        System.out.println("3. menghitung nilai rata2");
        System.out.print("masukan piihan(1-3) : ");
        int pilih=scan.nextInt();
        switch(pilih){
        case 1:
        statistika.modus();
        break;
        case 2:
        statistika.median();
        break;
        case 3:
        statistika.mean();
        break;
        }
        

        //Cetak angka
        // perhitungan.isiAngka(nil1,nil2);
        // perhitungan.showAngka();
    }
}