class Persegi extends BangunDatar{
    int angka;

    // void sisi(int angka){
    //     this.angka = angka;
    // }

    public Persegi(int angka, int panjang, int lebar){
        this.angka = angka;
        super.BangunDatar(angka,panjang,lebar);
    }

    @Override
    int luas(){
        int hasil = angka*angka;
        int nilai = super.panjang * hasil
        return nilai;
    }

    @Override
    int keliling(){
        int hasil = 4 * angka;
        return hasil;
    }
}