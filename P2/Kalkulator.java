class Kalkulator{
    public static void main(String[] args){
        System.out.println(pertambahan(5,6));
        perkalian(5,6);
    }

    public static int pertambahan(int nil1,  int nil2){
        int hasil = nil1 + nil2;
        return hasil;
    }

    public static void perkalian(int nil1, int nil2){
        int hasil = nil1 * nil2;
        System.out.print(hasil);
    }
}