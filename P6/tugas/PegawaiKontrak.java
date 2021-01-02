    public class PegawaiKontrak extends Pegawai{
   
    int gajiTambahan,totalGajiPK;

    public void Absen(){
        System.out.println("Pegawai Kontrak");
    }

    void gajiPegawaiKontrak(int JumlahLemburBos){
        totalGajiPK = gajiTambahan+gajiPokok;
        System.out.println("Gaji Pegawai Kontrak = "+ totalGajiPK);
    }
}