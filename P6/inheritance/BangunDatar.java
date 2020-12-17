class BangunDatar{
    int panjang;
    int lebar;

    public BangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar =lebar;
    }

    int luas(){
        int hasil = panjang*lebar;
        return hasil;
    }

    int keliling(){
        int hasil =2*(panjang+lebar);
        return hasil;
    }
}