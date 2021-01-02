public class BangunDatar{
    private int angka1;
    private int angka2;

    public void setAngka(int angka1, int angka2){
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public  void getAngka(){
        System.out.println("angka pertama : " + this.angka1);
        System.out.println("angka kedua : " + this.angka2);
    }
}