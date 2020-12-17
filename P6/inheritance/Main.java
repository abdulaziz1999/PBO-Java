class Main{
    public static void main(String arhgs[]){
        Persegi persegi = new Persegi();
        persegi.sisi(10);
        int luasPersegi = persegi.luas();
        int kelilingPersegi = persegi.keliling();

        System.out.println("Hasil dari luas persegi = " + luasPersegi);
        System.out.println("Hasil dari keliling persegi = " + kelilingPersegi);
    }
}