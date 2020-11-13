class Kalkulator{

    public static void main(String args []){
        Aritmatika perhitungan = new Aritmatika(7,2);

        int nil1 ,nil2,pertambahan,pengurangan,modulo,arit;
        nil1 = 10;
        nil2 = 5;

        pertambahan = perhitungan.pertambahan(nil1,nil2);
        pengurangan = perhitungan.pengurangan(nil1,nil2);
        modulo      = perhitungan.modulo(nil1,nil2);
        arit        = Aritmatika.modulo(nil1,nil2);

        //Print pertambahan Dan Pengurangan
        System.out.println("Hasil pertambahan : "+pertambahan);
        System.out.println("Hasil pengurangan : "+pengurangan);
        System.out.println("Hasil modulo : "+modulo);
        System.out.println("Hasil arit : "+arit);

        //Print Hasil Perkalian dan Pembagian
        perhitungan.perkalian(nil1,nil2);
        perhitungan.pembagian(nil1,nil2);

        //Cetak angka
        perhitungan.isiAngka(nil1,nil2);
        perhitungan.showAngka();
    }
}