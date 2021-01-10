class Main {
    public static void main(String args[]){
        Data <Integer> dataInt = new Data <Integer> (90,70);
        Data <String> dataStr = new Data <String> ("Abdul","Aziz");

        dataInt.showData();
        dataStr.showData();

         //Membuat Instance dan Mendefinisikan Tipe Data String
        DataMahasiswa<String> nama = new DataMahasiswa<String>();
        nama.setManusia("Wildan");
        System.out.println("Nama Saya: "+nama.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Integer
        DataMahasiswa<Integer> umur = new DataMahasiswa<Integer>();
        umur.setManusia(19);
        System.out.println("Usia Saya: "+umur.getManusia()+" Tahun");
        
        //Membuat Instance dan Mendefinisikan Tipe Data Boolean
        DataMahasiswa<Boolean> kondisi = new DataMahasiswa<Boolean>();
        kondisi.setManusia(true);
        System.out.println("Saya Sedang Belajar Java: "+kondisi.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Float
        DataMahasiswa<Float> IPK = new DataMahasiswa<Float>();
        IPK.setManusia(3.5f);
        System.out.println("Nilai IPK Saya: "+IPK.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Character
        DataMahasiswa<Character> Karakter = new DataMahasiswa<Character>();
        Karakter.setManusia('W');
        System.out.println("Huruf Awalan Nama Saya Adalah: "+Karakter.getManusia());
    }
}