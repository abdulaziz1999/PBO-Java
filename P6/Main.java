class Main{
    public static void main(String arhgs[]){
        Persegi persegi = new Persegi();
        persegi.sisi(10);
        int luasPersegi = persegi.luasPersegi();

        System.out.println("Hasil dari luas = " + luasPersegi);
        System.out.println("Hasil dari luas bangun datar = " + persegi.luas());
        System.out.println("Hasil dari keliling bangun datar = " + persegi.keliling());
    }
}