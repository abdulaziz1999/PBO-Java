class ListData<K, V>{
    K kunci;
    V nilai;

    public ListData(K kunci , V nilai){
        this.kunci = kunci;
        this.nilai = nilai;
    }

    public void LIstDataLama(){
        System.out.println("Kunci lama adalah = " + nilaiPertama);
        System.out.println("Nilai lama adalah = " + nilaiKedua);
    }

    public <K, V> void ListDataBaru (K kunci, V nilai){
        System.out.println("Nilai baru adalah = " + nilaiPertama);
        System.out.println("Nilai baru adalah = " + nilaiKedua);
    }
}