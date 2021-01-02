public class BangunDatar{

    public static void main(String args[]){
        int keliling1 = keliling(10);
        double keliling2 = keliling(2,3);
        System.out.println("Nilai Keliling pertama : " + keliling1);
        System.out.println("Nilai Keliling kedua : " + keliling2);
    }

    static public int keliling(int r){
        int nilai = 2 * r;
        return nilai;
    }

    static public double keliling(double r,double d){
        double nilai = 2 * (r+d);
        return nilai;
    }
}