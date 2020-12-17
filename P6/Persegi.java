class Persegi extends BangunDatar{
    int angka;

    void sisi(int angka){
        this.angka = angka;
    }

    int luasPersegi(){
        int hasil = angka*angka;
        return hasil;
    }
}