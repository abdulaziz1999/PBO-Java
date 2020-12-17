class Modus {
    public static void main(String[] args) {
        // inisialisasi nilai-nilai yang akan dicari modusnya
        int[] nilai = {10, 19, 200, 19, 4, 3, 7, 10, 19, 25, 19, 32, 10, 19, 200, 200, 10, 10};
 
        /* deklarasi tabel frekuensi
           asumsi rentang nilai yang akan dicari
           modusnya adalah antara 0 sampai 255
         */
        int[] tabelFrekuensi = new int[255];
 
        // seluruh tabelFrekuensi nilai awalnya adalah 0 (nol)
        for (int i=0; i<255; i++) {
            tabelFrekuensi[i] = 0;
        }
 
        // tampung
        for (int i=0; i<nilai.length; i++) {
            tabelFrekuensi[nilai[i]]++;
        }
 
        // cari nilai modus
        int nilaiModus = 0;
        for (int i=0; i<255; i++) {
            if (tabelFrekuensi[i] > nilaiModus) {
                nilaiModus = i;
            }
        }

        
 
        System.out.println("\nModusnya : " + nilaiModus);
        System.out.println("Nilai " + nilaiModus + " muncul sebanyak " + tabelFrekuensi[nilaiModus] + " kali");
        
    }
}