    public class Bos extends Pegawai{
   
    int gajiBonus,gajiLembur,total,JumlahLemburBos;

    public void Absen(){
        System.out.println("PT Teknologi Raya");
    }

    void gajiBos(int JumlahLemburBos){
        gajiLembur = gajiLembur*JumlahLemburBos;
        total = gajiBonus+gajiLembur+gajiPokok;
        System.out.println("Gaji Bos = "+ total);
    }
}