class Aritmatika{
    // int Angka1,Angka2;

    // public Aritmatika(int Angka1,int Angka2){
    //     this.Angka1 = Angka1;
    //     this.Angka2 = Angka2;
    // }

    int pertambahan(int nil1, int nil2){
        int hasilPertambahan = nil1+nil2;

        return hasilPertambahan;
    }

    int pengurangan(int nil1, int nil2){
        int hasilPengurangan = nil1-nil2;

        return hasilPengurangan;
    }

    static int modulo(int nil1,int nil2){
        int sisaBagi = nil1%nil2;

        return sisaBagi;
    }

    // void showAngka(){
    //     System.out.println("Angka Pertama : "+Angka1);
    //     System.out.println("Angka Kedua : "+Angka2);
    // }

    // void isiAngka(int Angka1,int Angka2){
    //     this.Angka1 = Angka1;
    //     this.Angka2 = Angka2;
    // }

    void perkalian(int nil1, int nil2){
        int hasilPerkalian = nil1*nil2;

        System.out.println("Hasil Perkalian : "+hasilPerkalian);
    }

    void pembagian(int nil1, int nil2){
        int hasilPembagian = nil1/nil2;

        System.out.println("Hasil Pembagian : "+hasilPembagian);
    }

    
}