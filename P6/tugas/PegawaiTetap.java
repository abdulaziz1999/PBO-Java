    public class PegawaiTetap extends Bos{
   
    int gajiLembur = 500;
    int gajiTunjangan = 100000;
    int totalGajiPt,jumlahLembur;

    public void Absen(){
        System.out.println("Pegwai Tetap");
    }

    void gajiPegawaiTetap(int jumlahLembur){
        gajiLembur = gajiLembur*jumlahLembur;
        totalGajiPt = gajiTunjangan+gajiLembur+gajiPokok;
        System.out.println("Gaji Pegawai Tetap = "+ totalGajiPt);
    }
}