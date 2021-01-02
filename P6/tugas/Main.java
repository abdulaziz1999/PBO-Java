class Main{
    public static void main(String arhgs[]){
        
        Pegawai objSuper =  new Pegawai();
        Bos objSubA = new Bos();
        PegawaiTetap objSubB = new PegawaiTetap();
        PegawaiKontrak objSubC = new PegawaiKontrak();

        System.out.println("Gaji Pokok");
        objSuper.Absen();
        objSuper.gaji();
        System.out.println("\n");

        System.out.println("Gaji Bos");
        objSubA.Absen();
        objSubA.gajiBos(4);
        System.out.println("\n");

        System.out.println("Gaji Pegawai Tetap \n");
        objSuper.nama("Adi Pratama");
        objSubB.Absen();
        objSubB.gajiPegawaiTetap(5);
        System.out.println("\n");

        System.out.println("Gaji Pegawai Kontrak \n");
        objSuper.nama("Abdullah");
        objSubC.Absen();
        objSubC.gajiPegawaiKontrak(500);
        System.out.println("\n");

    }
}