public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataMahasiswa objek = new DataMahasiswa();
        objek.ModifNama("Abdul Aziz");
        System.out.println("Nama : " + objek.getNama());

    }
}