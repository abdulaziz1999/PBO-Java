class Data <T> {
    T nilaiPertama;
    T nilaiKedua;

    public Data (T nilaiPertama , T nilaiKedua){
        this.nilaiPertama = nilaiPertama;
        this.nilaiKedua = nilaiKedua;
    }

    public void showData(){
        System.out.println("Nilai pertama = " + nilaiPertama);
        System.out.println("Nilai kedua = " + nilaiKedua);
    }
}