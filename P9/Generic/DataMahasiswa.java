class DataMahasiswa<T> {
    
    //T Adalah Kepanjangan dari Tipe Parameter
    private T Manusia;
    
    //Method Void Set Dengan Tipe Parameter T
    protected void setManusia(T Manusia){
        this.Manusia = Manusia;
    }
    
    //Method Return Get Yang Mengembalikan Nilai Manusia
    protected T getManusia(){
        return Manusia;
    }
}